package com.gla.collections;
import java.util.*;
class Product {
    String name;
    double price;
    int stock;
    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    @Override
    public String toString() {
        return name + " | Price: " + price + " | Stock: " + stock;
    }
}
public class InventoryandRestockManagementSystem {
    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>();
        List<Product> productList = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Stack<Product> restockStack = new Stack<>();
        addProduct(productNames, productList, new Product("Milk", 50, 5));
        addProduct(productNames, productList, new Product("Bread", 30, 2));
        addProduct(productNames, productList, new Product("Eggs", 60, 12));
        addProduct(productNames, productList, new Product("Milk", 50, 10));
        for (Product p : productList) {
            if (p.stock <= 5) {
                restockQueue.add(p);
            }
        }
        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            System.out.println("Restocking: " + p.name);
            restockStack.push(new Product(p.name, p.price, p.stock));
            p.stock += 10;
        }
        if (!restockStack.isEmpty()) {
            Product last = restockStack.pop();
            for (Product p : productList) {
                if (p.name.equals(last.name)) {
                    p.stock = last.stock;
                    System.out.println("\nUndo Restock: " + p.name);
                }
            }
        }
        System.out.println("\nFinal Inventory:");
        for (Product p : productList) {
            System.out.println(p);
        }
    }
    static void addProduct(Set<String> names, List<Product> list, Product p) {
        if (names.add(p.name)) {
            list.add(p);
            System.out.println("Added: " + p.name);
        } else {
            System.out.println("Duplicate Product Ignored: " + p.name);
        }
    }
}
