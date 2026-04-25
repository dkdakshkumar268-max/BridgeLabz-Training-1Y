package com.gla.collections;

import java.util.*;
class student implements Comparable<student> {
    int id;
    String name;
    double marks;
  public  student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        student s = (student) o;
        return id == s.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public int compareTo(student s) {
        if (this.marks != s.marks) {
            return Double.compare(s.marks, this.marks);
        }
        return this.id - s.id;
    }
    @Override
    public String toString() {
        return id + " | " + name + " | Marks: " + marks;
    }
}
public class CollegeAdmissionSystem {
    public static void main(String[] args) {
        List<student> applicants = new ArrayList<>();
        Set<student> shortlisted = new HashSet<>();
        Queue<student> interviewQueue = new LinkedList<>();
        TreeSet<student> meritList = new TreeSet<>();
        applicants.add(new student(1, "A", 85));
        applicants.add(new student(2, "Riya", 92));
        applicants.add(new student(3, "Karan", 75));
        applicants.add(new student(4, "Neha", 88));
        applicants.add(new student(2, "Riya", 92));
        for (student s : applicants) {
            if (s.marks >= 80) {
                shortlisted.add(s);
            }
        }
        for (student s : shortlisted) {
            interviewQueue.add(s);
        }
        while (!interviewQueue.isEmpty()) {
            student s = interviewQueue.poll();
            System.out.println("Interviewing: " + s.name);
            meritList.add(s);
        }
        System.out.println("\n Final Merit List:");
        for (student s : meritList) {
            System.out.println(s);
        }
    }
}
