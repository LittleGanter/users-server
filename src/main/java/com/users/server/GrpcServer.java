package com.users.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 5433;

        Server server = ServerBuilder.forPort(port)
                .addService(new UserServiceImpl())
                .build()
                .start();

        System.out.println("gRPC сервер запущен на порту " + port);

        server.awaitTermination();
    }
}