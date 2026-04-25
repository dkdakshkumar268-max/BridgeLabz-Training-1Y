package com.gla.collections;

import java.util.*;
public class BankingSystem {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();
        accounts.put("ACC101", 5000.0);
        accounts.put("ACC102", 12000.0);
        accounts.put("ACC103", 8000.0);
        accounts.put("ACC104", 15000.0);
        accounts.put("ACC105", 3000.0);
        deposit(accounts, "ACC101", 2000);
        withdraw(accounts, "ACC103", 9000); // exceeds balance
        withdraw(accounts, "ACC102", 2000);
        System.out.println("\n Customer Balances:");
        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        List<Map.Entry<String, Double>> list=new ArrayList<>(accounts.entrySet());
        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));
        System.out.println("\n Sorted by Balance (Descending):");
        for (Map.Entry<String, Double> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("\n Top 3 Customers:");
        for (int i = 0; i < Math.min(3, list.size()); i++) {
            Map.Entry<String, Double> entry = list.get(i);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    static void deposit(Map<String, Double> accounts,String accNo, double amount) {
        if (!accounts.containsKey(accNo)) {
            System.out.println("Account not found: " + accNo);
            return;
        }
        accounts.put(accNo, accounts.get(accNo) + amount);
        System.out.println("Deposited " + amount + " to " + accNo);
    }
    static void withdraw(Map<String, Double> accounts,String accNo, double amount) {
        if (!accounts.containsKey(accNo)) {
            System.out.println("Account not found: " + accNo);
            return;
        }
        double current = accounts.get(accNo);
        if (amount > current) {
            System.out.println("Insufficient balance in " + accNo);
        } else {
            accounts.put(accNo, current - amount);
            System.out.println("Withdrawn " + amount + " from " + accNo);
        }
    }
}
