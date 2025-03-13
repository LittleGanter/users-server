package com.users.server;

import com.example.users.UsersGrpc;
import com.example.users.UsersOuterClass.*;
import com.users.nats.NatsPublisher;
import com.users.database.DatabaseConnection;
import com.users.utils.ValidationException;
import com.users.utils.ValidationUtils;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.sql.Connection;
import java.sql.SQLException;

public class UserServiceImpl extends UsersGrpc.UsersImplBase {
    @Override
    public void create(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        try {
            // Валидация входных данных
            ValidationUtils.validateUsername(request.getUsername());
            ValidationUtils.validateEmail(request.getEmail());

            try (Connection conn = DatabaseConnection.getConnection()) {
                String sql = "INSERT INTO public.users (username, email) VALUES (?, ?) RETURNING id, created_at";
                try (var ps = conn.prepareStatement(sql)) {
                    ps.setString(1, request.getUsername());
                    ps.setString(2, request.getEmail());

                    var rs = ps.executeQuery();
                    if (rs.next()) {
                        UserResponse response = UserResponse.newBuilder()
                                .setId(rs.getInt("id"))
                                .setUsername(request.getUsername())
                                .setEmail(request.getEmail())
                                .setCreatedAt(rs.getString("created_at"))
                                .build();

                        responseObserver.onNext(response);
                        responseObserver.onCompleted();

                        String message = String.format("User created: ID=%d, Name=%s, Email=%s",
                                response.getId(), response.getUsername(), response.getEmail());
                        NatsPublisher.publish("users.events", message);
                    }
                }
            }
        } catch (ValidationException e) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription(e.getMessage()).asRuntimeException());
        } catch (SQLException e) {
            responseObserver.onError(Status.INTERNAL.withDescription("Database error: " + e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void read(UserIdRequest request, StreamObserver<UserResponse> responseObserver) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "SELECT id, username, email, created_at FROM public.users WHERE id = ?";
            try (var ps = conn.prepareStatement(sql)) {
                ps.setInt(1, request.getId());

                var rs = ps.executeQuery();
                if (rs.next()) {
                    UserResponse response = UserResponse.newBuilder()
                            .setId(rs.getInt("id"))
                            .setUsername(rs.getString("username"))
                            .setEmail(rs.getString("email"))
                            .setCreatedAt(rs.getString("created_at"))
                            .build();

                    responseObserver.onNext(response);
                } else {
                    responseObserver.onError(Status.NOT_FOUND.withDescription("User not found").asRuntimeException());
                }
                responseObserver.onCompleted();
            }
        } catch (SQLException e) {
            responseObserver.onError(Status.INTERNAL.withDescription("Database error: " + e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void update(UpdateUserRequest request, StreamObserver<UserResponse> responseObserver) {
        try {
            // Валидация
            ValidationUtils.validateUsername(request.getUsername());
            ValidationUtils.validateEmail(request.getEmail());

            try (Connection conn = DatabaseConnection.getConnection()) {
                String sql = "UPDATE public.users SET username = ?, email = ? WHERE id = ? RETURNING id, created_at";
                try (var ps = conn.prepareStatement(sql)) {
                    ps.setString(1, request.getUsername());
                    ps.setString(2, request.getEmail());
                    ps.setInt(3, request.getId());

                    var rs = ps.executeQuery();
                    if (rs.next()) {
                        UserResponse response = UserResponse.newBuilder()
                                .setId(request.getId())
                                .setUsername(request.getUsername())
                                .setEmail(request.getEmail())
                                .setCreatedAt(rs.getString("created_at"))
                                .build();

                        responseObserver.onNext(response);
                        responseObserver.onCompleted();

                        String message = String.format("User updated: ID=%d, Name=%s, Email=%s",
                                response.getId(), response.getUsername(), response.getEmail());
                        NatsPublisher.publish("users.events", message);
                    } else {
                        responseObserver.onError(Status.NOT_FOUND.withDescription("User not found").asRuntimeException());
                    }
                }
            }
        } catch (ValidationException e) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription(e.getMessage()).asRuntimeException());
        } catch (SQLException e) {
            responseObserver.onError(Status.INTERNAL.withDescription("Database error: " + e.getMessage()).asRuntimeException());
        }
    }

    @Override
    public void delete(UserIdRequest request, StreamObserver<DeleteUserResponse> responseObserver) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            String sql = "DELETE FROM public.users WHERE id = ?";
            try (var ps = conn.prepareStatement(sql)) {
                ps.setInt(1, request.getId());
                int affectedRows = ps.executeUpdate();

                if (affectedRows > 0) {
                    DeleteUserResponse response = DeleteUserResponse.newBuilder().setSuccess(true).build();
                    responseObserver.onNext(response);
                    responseObserver.onCompleted();

                    String message = String.format("User deleted: ID=%d", request.getId());
                    NatsPublisher.publish("users.events", message);
                } else {
                    responseObserver.onError(Status.NOT_FOUND.withDescription("User not found").asRuntimeException());
                }
            }
        } catch (SQLException e) {
            responseObserver.onError(Status.INTERNAL.withDescription("Database error: " + e.getMessage()).asRuntimeException());
        }
    }
}