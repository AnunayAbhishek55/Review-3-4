package com.example.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JTextField nameField;
    private JTextField emailField;
    private JButton submitButton;
    private JLabel statusLabel;

    public MainFrame() {
        setTitle("GUI Data Validation Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Initialize components
        nameField = new JTextField(20);
        emailField = new JTextField(20);
        submitButton = new JButton("Submit");
        statusLabel = new JLabel("Please enter your details.");

        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Email:"));
        add(emailField);
        add(submitButton);
        add(statusLabel);

        submitButton.addActionListener(new SubmitButtonListener());

        // Set default status
        statusLabel.setForeground(Color.BLACK);
    }

    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = nameField.getText();
            String email = emailField.getText();

            // Validate data
            if (Validation.isNameValid(name) && Validation.isEmailValid(email)) {
                statusLabel.setText("Data submitted successfully!");
                statusLabel.setForeground(Color.GREEN);
            } else {
                statusLabel.setText("Invalid data. Please check your input.");
                statusLabel.setForeground(Color.RED);
            }
        }
    }
}
