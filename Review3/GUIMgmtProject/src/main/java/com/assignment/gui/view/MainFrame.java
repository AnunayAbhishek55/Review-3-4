package com.assignment.gui.view;

import com.assignment.gui.controller.StudentController;
import com.assignment.gui.model.Student;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainFrame extends JFrame {

    private JTextField nameField;
    private JTextField ageField;
    private JButton addButton;
    private JTextArea displayArea;
    private StudentController controller;

    public MainFrame() {
        setTitle("Student Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        controller = new StudentController();

        // Setup UI components
        setupUI();

        // Show the frame
        setVisible(true);
    }

    private void setupUI() {
        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Age:"));
        ageField = new JTextField();
        inputPanel.add(ageField);
        addButton = new JButton("Add Student");
        inputPanel.add(addButton);

        // Display Area
        displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Layout
        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Add Event Listeners
        addButton.addActionListener(e -> addStudent());
    }

    private void addStudent() {
        String name = nameField.getText();
        String ageText = ageField.getText();

        try {
            controller.addStudent(name, ageText);
            List<Student> students = controller.getAllStudents();
            displayArea.setText("");
            students.forEach(student -> displayArea.append(student + "\n"));
            clearFields();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        nameField.setText("");
        ageField.setText("");
    }
}
