package com.users.client;

import com.example.users.UsersGrpc;
import com.example.users.UsersOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5433)
                .usePlaintext()
                .build();

        UsersGrpc.UsersBlockingStub stub = UsersGrpc.newBlockingStub(channel);

        try {
            UsersOuterClass.UserRequest createRequest = UsersOuterClass.UserRequest.newBuilder()
                    .setUsername("Jonn Doe")
                    .setEmail("johndoe@example.com")
                    .build();
            UsersOuterClass.UserResponse createResponse = stub.create(createRequest);
            System.out.println("Создан пользователь: " + createResponse);

            int userId = createResponse.getId(); // Запоминаем ID созданного пользователя

            UsersOuterClass.UserIdRequest readRequest = UsersOuterClass.UserIdRequest.newBuilder()
                    .setId(userId)
                    .build();

            UsersOuterClass.UserResponse readResponse = stub.read(readRequest);
            System.out.println("Прочитанный пользователь: " + readResponse);

            UsersOuterClass.UpdateUserRequest updateRequest = UsersOuterClass.UpdateUserRequest.newBuilder()
                    .setId(userId)
                    .setUsername("John Updated")
                    .setEmail("newemail@example.com")
                    .build();

            UsersOuterClass.UserResponse updateResponse = stub.update(updateRequest);
            System.out.println("Обновленный пользователь: " + updateResponse);

            UsersOuterClass.UserIdRequest deleteRequest = UsersOuterClass.UserIdRequest.newBuilder()
                    .setId(userId)
                    .build();

            UsersOuterClass.DeleteUserResponse deleteResponse = stub.delete(deleteRequest);
            System.out.println("Пользователь удален: " + deleteResponse.getSuccess());
        } catch (StatusRuntimeException e) {
            System.err.println("gRPC ошибка: " + e.getStatus());
        } finally {
            channel.shutdown();
        }
    }
}