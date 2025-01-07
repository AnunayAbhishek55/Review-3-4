package com.assignment.console.librarymgmt.util;

public class Validator {
    public static boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }
}
