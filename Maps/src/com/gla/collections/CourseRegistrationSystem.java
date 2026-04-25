package com.gla.collections;

import java.util.*;

public class CourseRegistrationSystem {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();
        courses.put("CS101", 45);
        courses.put("CS102", 52);
        courses.put("CS103", 3);
        courses.put("CS104", 60);
        courses.put("CS105", 10);
        addStudent(courses, "CS101", 5);
        dropStudent(courses, "CS103", 2);
        dropStudent(courses, "CS105", 15);
        System.out.println(" Course Registrations:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("\n Near Full Courses (>=50):");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() >= 50) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("\n️ Under-Subscribed Courses (<5):");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() < 5) {
                System.out.println(entry.getKey());
            }
        }
    }
    static void addStudent(Map<String, Integer> courses,String course, int count) {
        courses.put(course,courses.getOrDefault(course, 0) + count);
        System.out.println("Added " + count + " students to " + course);
    }
    static void dropStudent(Map<String, Integer> courses,String course, int count) {
        if (!courses.containsKey(course)) {
            System.out.println(course + " not found");
            return;
        }
        int current = courses.get(course) - count;
        if (current < 0) current = 0;
        courses.put(course, current);
        System.out.println("Dropped " + count + " students from "+course + ", Remaining: " + current);
    }
}