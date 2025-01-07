package com.example;

public class Task {

    private String title;
    private String description;
    private boolean isComplete;

    // Constructor to initialize the task
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.isComplete = false; // default state is not completed
    }

    // Getter and Setter methods for task fields
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    // Method to mark the task as complete
    public void markComplete() {
        this.isComplete = true;
    }

    // Method to display task details
    public void displayTask() {
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Status: " + (isComplete ? "Completed" : "Pending"));
        System.out.println();
    }
}
