package com.gla.collections;

import java.util.*;

public class InventorySystem {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Milk", 10);
        inventory.put("Bread", 5);
        inventory.put("Eggs", 12);
        buyProduct(inventory, "Milk", 3);
        buyProduct(inventory, "Bread", 5);
        restockProduct(inventory, "Bread", 10);
        restockProduct(inventory, "Butter", 8);
        checkStock(inventory, "Milk");
        checkStock(inventory, "Cheese");
        System.out.println("\n Out of Stock Products:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println(entry.getKey());
            }
        }
    }
    static void buyProduct(Map<String, Integer> inventory,String product, int qty) {
        if (!inventory.containsKey(product)) {
            System.out.println(product + " not available");
            return;
        }
        int current = inventory.get(product) - qty;
        if (current <= 0) {
            inventory.put(product, 0);
            System.out.println(product + " is now OUT OF STOCK");
        } else {
            inventory.put(product, current);
            System.out.println("Bought " + qty + " " + product+", Remaining: " + current);
        }
    }
    static void restockProduct(Map<String, Integer> inventory,String product, int qty) {
        inventory.put(product,inventory.getOrDefault(product, 0) + qty);
        System.out.println("Restocked " + product +", Total: " + inventory.get(product));
    }
    static void checkStock(Map<String, Integer> inventory,String product) {
        if (inventory.containsKey(product)) {
            System.out.println(product + " stock: " +inventory.get(product));
        } else {
            System.out.println(product + " not stocked");
        }
    }
}
