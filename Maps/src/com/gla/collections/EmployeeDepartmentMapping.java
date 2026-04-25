package com.gla.collections;

import java.util.*;
public class EmployeeDepartmentMapping {
    public static void main(String[] args) {
        Map<Integer, String> empDept = new HashMap<>();
        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "Finance");
        empDept.put(104, "IT");
        empDept.put(105, "HR");
        empDept.put(106, "IT");
        empDept.put(103, "HR");
        System.out.println(" Employee → Department:");
        for (Map.Entry<Integer, String> entry : empDept.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        String searchDept = "IT";
        System.out.println("\n Employees in " + searchDept + ":");
        for (Map.Entry<Integer, String> entry : empDept.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(searchDept)) {
                System.out.println("Employee ID: " + entry.getKey());
            }
        }
        Map<String, Integer> deptCount = new HashMap<>();
        for (String dept : empDept.values()) {
            deptCount.put(dept,deptCount.getOrDefault(dept, 0) + 1);
        }
        System.out.println("\n Employees per Department:");
        for (Map.Entry<String, Integer> entry : deptCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
