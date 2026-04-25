package com.gla.collections;

import java.util.*;
class Employee {
    String name;
    String department;
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    @Override
    public String toString() {
        return name;
    }
}
public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Akshat", "HR"));
        employees.add(new Employee("Shikhar", "IT"));
        employees.add(new Employee("Praveen", "HR"));
        Map<String, List<Employee>> map = new HashMap<>();
        for (Employee e : employees) {
            map.computeIfAbsent(e.department, k -> new ArrayList<>()).add(e);
        }
        for (Map.Entry<String, List<Employee>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
