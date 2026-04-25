package com.gla.collections;

import java.util.*;

public class ExamResults {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> data = new HashMap<>();
        Map<String, Integer> math = new HashMap<>();
        math.put("Akshat", 95);
        math.put("Shikhar", 88);
        math.put("Aman", 76);
        Map<String, Integer> science = new HashMap<>();
        science.put("Akshat", 85);
        science.put("Praveen", 91);
        science.put("Ram", 72);
        Map<String, Integer> english = new HashMap<>();
        english.put("Aman", 92);
        english.put("Shikhar", 81);
        english.put("Ram", 67);
        data.put("Math", math);
        data.put("Science", science);
        data.put("English", english);
        System.out.println(" Topper per Subject:");
        for (Map.Entry<String, Map<String, Integer>> entry : data.entrySet()) {
            String subject = entry.getKey();
            Map<String, Integer> students = entry.getValue();
            String topper = null;
            int max = Integer.MIN_VALUE;
            for (Map.Entry<String, Integer> s : students.entrySet()) {
                if (s.getValue() > max) {
                    max = s.getValue();
                    topper = s.getKey();
                }
            }
            System.out.println(subject + " → " + topper + " (" + max + ")");
        }
        System.out.println("\n Average Score per Subject:");
        for (Map.Entry<String, Map<String, Integer>> entry : data.entrySet()) {
            String subject = entry.getKey();
            Map<String, Integer> students = entry.getValue();
            int sum = 0;
            for (int marks : students.values()) {
                sum += marks;
            }
            double avg = (double) sum / students.size();
            System.out.println(subject + " → " + avg);
        }
        System.out.println("\n Subjects with at least one score > 90:");
        for (Map.Entry<String, Map<String, Integer>> entry : data.entrySet()) {
            String subject = entry.getKey();
            Map<String, Integer> students = entry.getValue();
            for (int marks : students.values()) {
                if (marks > 90) {
                    System.out.println(subject);
                    break;
                }
            }
        }
    }
}
