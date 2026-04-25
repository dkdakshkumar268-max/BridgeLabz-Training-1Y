package com.gla.collections;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Map<String, Double> cart = new LinkedHashMap<>();
        cart.put("Laptop", 45000.0);
        cart.put("Headphones", 2000.0);
        cart.put("Mouse", 500.0);
        cart.put("Keyboard", 1500.0);
        cart.remove("Mouse");
        System.out.println(" Cart Items:");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " : ₹" + entry.getValue());
        }
        double total = 0;
        for (double price : cart.values()) {
            total += price;
        }
        System.out.println("\n Total Amount: ₹" + total);
        if (total > 5000) {
            double discount = total * 0.10;
            total -= discount;
            System.out.println(" 10% Discount Applied: -₹" + discount);
        }
        System.out.println(" Final Bill: ₹" + total);
    }
}