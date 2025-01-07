package com.assignment.gui;

import com.assignment.gui.view.MainFrame;

public class Main {
    public static void main(String[] args) {
        // Launch the MainFrame GUI
        javax.swing.SwingUtilities.invokeLater(() -> {
            new MainFrame();
        });
    }
}
