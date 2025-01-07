package com.assignment.gui.util;

public class Validator {

    public static boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    public static boolean isValidAge(String ageText) {
        try {
            int age = Integer.parseInt(ageText);
            return age > 0 && age <= 100;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
