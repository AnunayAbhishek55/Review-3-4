package com.example.gui;

import com.example.gui.MainFrame;

public class App {
    public static void main(String[] args) {
        // Create and display the main frame
        javax.swing.SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}