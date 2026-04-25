package com.gla.collections;

import java.util.*;

class Book {
    String title;
    boolean isIssued;
    Book(String title) {
        this.title = title;
        this.isIssued = false;
    }
    @Override
    public String toString() {
        return title + (isIssued ? " (Issued)" : " (Available)");
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Set<String> members = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Stack<Book> returnStack = new Stack<>();
        books.add(new Book("Java Basics"));
        books.add(new Book("Data Structures"));
        books.add(new Book("Operating Systems"));
        registerMember(members, "M101");
        registerMember(members, "M102");
        registerMember(members, "M101");
        issueQueue.add(books.get(0));
        issueQueue.add(books.get(1));
        System.out.println("\nIssuing Books:");
        while (!issueQueue.isEmpty()) {
            Book b = issueQueue.poll();
            if (!b.isIssued) {
                b.isIssued = true;
                System.out.println("Issued: " + b.title);
            }
        }
        System.out.println("\nReturning Books:");
        Book returnedBook = books.get(0);
        returnedBook.isIssued = false;
        returnStack.push(returnedBook);
        System.out.println("Returned: " + returnedBook.title);
        if (!returnStack.isEmpty()) {
            Book b = returnStack.pop();
            b.isIssued = true;
            System.out.println("\nRe-Issued: " + b.title);
        }
        System.out.println("\n Final Book Status:");
        for (Book b : books) {
            System.out.println(b);
        }
    }
    static void registerMember(Set<String> members, String id) {
        if (members.add(id)) {
            System.out.println("Registered Member: " + id);
        } else {
            System.out.println("Duplicate Member Ignored: " + id);
        }
    }
}
