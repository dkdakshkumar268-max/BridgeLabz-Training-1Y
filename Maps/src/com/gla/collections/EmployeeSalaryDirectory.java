package com.gla.collections;

import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> employees = new HashMap<>();
        employees.put("Akshat", 50000.0);
        employees.put("Shikhar", 60000.0);
        employees.put("Praveen", 55000.0);
        employees.put("Aman", 48000.0);
        employees.put("Ram", 45000.0);
        employees.put("Riya", 62000.0);
        giveRaise(employees, "Akshat", 10);
        giveRaise(employees, "Aman", 5);
        giveRaise(employees, "Ram", 20);
        giveRaise(employees, "Rohit", 8);
        System.out.println("\n Employee Salaries:");
        for (Map.Entry<String, Double> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        double sum = 0;
        for (double salary : employees.values()) {
            sum += salary;
        }
        double avg = sum / employees.size();
        System.out.println("\n Average Salary: " + avg);
        double maxSalary = Collections.max(employees.values());
        System.out.println("\n Highest Paid Employee(s):");
        for (Map.Entry<String, Double> entry : employees.entrySet()) {
            if (entry.getValue() == maxSalary) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
    static void giveRaise(Map<String, Double> employees,String name, double percent) {
        if (!employees.containsKey(name)) {
            System.out.println("Employee not found: " + name);
            return;
        }
        double current = employees.get(name);
        double updated = current + (current * percent / 100);
        employees.put(name, updated);
        System.out.println("Updated salary of " + name + " to " + updated);
    }
}