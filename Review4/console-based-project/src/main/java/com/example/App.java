package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Main loop to display the menu and perform actions
        do {
            System.out.println("Task Manager Menu:");
            System.out.println("1. Add a task");
            System.out.println("2. Mark a task as complete");
            System.out.println("3. View all tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    taskManager.promptTaskInput();
                    break;
                case 2:
                    System.out.println("Enter the task number to mark as complete:");
                    int taskIndex = scanner.nextInt() - 1;  // Convert to 0-based index
                    taskManager.markTaskComplete(taskIndex);
                    break;
                case 3:
                    taskManager.displayTasks();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
