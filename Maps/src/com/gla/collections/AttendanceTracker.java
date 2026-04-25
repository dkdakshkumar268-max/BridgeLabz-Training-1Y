package com.gla.collections;

import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();
        String[] students = {"Akshat", "Shikhar", "Praveen", "Aman", "Ram"};
        for (String s : students) {
            attendance.put(s, 0);
        }
        List<List<String>> monthlyAttendance = new ArrayList<>();
        monthlyAttendance.add(Arrays.asList("Akshat", "Aman"));
        monthlyAttendance.add(Arrays.asList("Shikhar", "Ram"));
        monthlyAttendance.add(Arrays.asList("Praveen", "Akshat"));
        monthlyAttendance.add(Arrays.asList("Akshat", "Shikhar", "Aman"));
        monthlyAttendance.add(Arrays.asList("Ram", "Praveen"));
        monthlyAttendance.add(Arrays.asList("Akshat", "Ram"));
        monthlyAttendance.add(Arrays.asList("Shikhar", "Praveen"));
        monthlyAttendance.add(Arrays.asList("Akshat", "Aman", "Ram"));
        monthlyAttendance.add(Arrays.asList("Praveen"));
        monthlyAttendance.add(Arrays.asList("Akshat", "Shikhar"));
        monthlyAttendance.add(Arrays.asList("Aman", "Ram"));
        monthlyAttendance.add(Arrays.asList("Akshat", "Praveen"));
        monthlyAttendance.add(Arrays.asList("Shikhar", "Ram"));
        monthlyAttendance.add(Arrays.asList("Akshat", "Aman"));
        monthlyAttendance.add(Arrays.asList("Praveen", "Shikhar"));
        for (List<String> day : monthlyAttendance) {
            for (String student : day) {
                attendance.put(student,
                        attendance.getOrDefault(student, 0) + 1);
            }
        }
        System.out.println(" Attendance Record:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        int threshold = 10;
        System.out.println("\n Students with attendance < " + threshold + ":");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < threshold) {
                System.out.println(entry.getKey());
            }
        }
    }
}
