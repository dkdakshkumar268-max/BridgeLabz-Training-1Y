package com.gla.streamapi;

import java.util.*;
class Product {
    String name;
    double price;
    double rating;
    double discount;
    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }
    @Override
    public String toString() {
        return name +" | Price: "+price+" | Rating: " + rating+" | Discount: "+discount + "%";
    }
}
public class ECommerceSort {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 70000, 4.5, 10));
        products.add(new Product("Phone", 30000, 4.7, 20));
        products.add(new Product("Headphones", 2000, 4.2, 30));
        products.add(new Product("Watch", 5000, 4.0, 25));
        Comparator<Product> byPrice = (p1, p2) -> Double.compare(p1.price, p2.price);
        Comparator<Product> byRating = (p1, p2) -> Double.compare(p2.rating, p1.rating);
        Comparator<Product> byDiscount = (p1, p2) -> Double.compare(p2.discount, p1.discount);
        System.out.println("Sort by Price:");
        products.sort(byPrice);
        products.forEach(System.out::println);
        System.out.println("\nSort by Rating:");
        products.sort(byRating);
        products.forEach(System.out::println);
        System.out.println("\nSort by Discount:");
        products.sort(byDiscount);
        products.forEach(System.out::println);
    }
}