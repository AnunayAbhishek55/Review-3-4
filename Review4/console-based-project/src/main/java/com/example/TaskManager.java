package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {

    private List<Task> tasks;  // List to store tasks

    // Constructor to initialize the task list
    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Method to add a task to the list
    public void addTask(String title, String description) {
        Task task = new Task(title, description);
        tasks.add(task);
    }

    // Method to mark a task as complete
    public void markTaskComplete(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.get(taskIndex).markComplete();
            System.out.println("Task marked as complete!");
        } else {
            System.out.println("Invalid task index.");
        }
    }

    // Method to display all tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("Task " + (i + 1) + ":");
                tasks.get(i).displayTask();
            }
        }
    }

    // Method to prompt user for task input (title and description)
    public void promptTaskInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter task title:");
        String title = scanner.nextLine();

        System.out.println("Enter task description:");
        String description = scanner.nextLine();

        addTask(title, description);
        System.out.println("Task added successfully!\n");
    }
}

