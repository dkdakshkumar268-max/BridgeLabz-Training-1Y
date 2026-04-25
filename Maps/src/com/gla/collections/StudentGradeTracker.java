package com.gla.collections;
import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>();
        grades.put("Shikhar", 85.5);
        grades.put("Akshat", 92.0);
        grades.put("Praveen", 78.5);
        grades.put("Shivendra", 88.0);
        grades.put("Jaish", 82.0);
        grades.remove("Jaish");
        System.out.println(" Student Grades (Sorted):");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
