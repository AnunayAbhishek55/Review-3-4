package com.example.gui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    // Validate name (only letters and spaces allowed)
    public static boolean isNameValid(String name) {
        return name != null && name.matches("[a-zA-Z\\s]+");
    }

    // Validate email (basic regex for email format)
    public static boolean isEmailValid(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
