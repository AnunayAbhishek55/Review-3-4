package com.assignment.gui.controller;

import com.assignment.gui.model.Student;
import com.assignment.gui.util.Validator;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

    private final List<Student> students = new ArrayList<>();

    public void addStudent(String name, String ageText) {
        if (Validator.isEmpty(name)) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (!Validator.isValidAge(ageText)) {
            throw new IllegalArgumentException("Age must be a valid number (1-100).");
        }

        int age = Integer.parseInt(ageText);
        students.add(new Student(name, age));
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
