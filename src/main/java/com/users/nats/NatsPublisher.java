package com.users.nats;

import io.nats.client.Connection;
import io.nats.client.Nats;
import io.nats.client.Options;

import java.nio.charset.StandardCharsets;

public class NatsPublisher {
    private static Connection natsConnection;

    static {
        try {
            // Устанавливаем соединение с NATS сервером
            Options options = new Options.Builder()
                    .server("nats://localhost:4222")
                    .build();

            natsConnection = Nats.connect(options);
            System.out.println("Подключено к NATS");
        } catch (Exception e) {
            System.err.println("Ошибка подключения к NATS: " + e.getMessage());
        }
    }

    public static void publish(String subject, String message) {
        try {
            if (natsConnection != null) {
                natsConnection.publish(subject, message.getBytes(StandardCharsets.UTF_8));
                System.out.println("Опубликовано в NATS [" + subject + "]: " + message);
            }
        } catch (Exception e) {
            System.err.println("Ошибка публикации в NATS: " + e.getMessage());
        }
    }
}