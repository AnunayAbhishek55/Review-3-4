package com.assignment.console.librarymgmt.service;

import com.assignment.console.librarymgmt.exception.LibraryException;
import com.assignment.console.librarymgmt.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryService {

    private final List<Book> books = new ArrayList<>();

    public void addBook(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        books.add(new Book(title, author));
        System.out.println("Book added successfully!");
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available!");
            return;
        }

        System.out.println("\n--- Book List ---");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }

    public void borrowBook(Scanner scanner) {
        if (books.isEmpty()) {
            throw new LibraryException("No books available to borrow!");
        }

        listBooks();

        System.out.print("Enter the book number to borrow: ");
        int bookNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (bookNumber < 1 || bookNumber > books.size()) {
            throw new LibraryException("Invalid book number!");
        }

        Book book = books.get(bookNumber - 1);
        if (book.isBorrowed()) {
            throw new LibraryException("Book is already borrowed!");
        }

        book.borrow();
        System.out.println("You have successfully borrowed \"" + book.getTitle() + "\".");
    }
}
