package com.gla.collections;

import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> catalog = new TreeMap<>();
        catalog.put("978-1234567890", "Java Programming");
        catalog.put("978-9876543210", "Data Structures");
        catalog.put("978-4567891230", "Operating Systems");
        searchByISBN(catalog, "978-1234567890");
        searchByISBN(catalog, "978-0000000000");
        catalog.remove("978-9876543210");
        System.out.println("\nRemoved ISBN 978-9876543210");
        System.out.println("\n Library Catalog:");
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        System.out.println("\n Search by Title:");
        searchByTitle(catalog, "Java Programming");
        searchByTitle(catalog, "Python Basics");
    }
    static void searchByISBN(Map<String, String> catalog, String isbn) {
        if (catalog.containsKey(isbn)) {
            System.out.println("Found: " + catalog.get(isbn));
        } else {
            System.out.println("Book not found for ISBN: " + isbn);
        }
    }
    static void searchByTitle(Map<String, String> catalog, String title) {
        boolean found = false;
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(title)) {
                System.out.println("Found ISBN: " + entry.getKey());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found: " + title);
        }
    }
}
