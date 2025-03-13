package com.users.utils;

import java.util.regex.Pattern;

public class ValidationUtils {
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    public static void validateUsername(String username) {
        if (username == null || username.isEmpty()) {
            throw new ValidationException("Username must not be empty");
        }
        if (username.length() < 3 || username.length() > 50) {
            throw new ValidationException("Username must be between 3 and 50 characters");
        }
    }

    public static void validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new ValidationException("Email must not be empty");
        }
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new ValidationException("Invalid email format");
        }
    }
}