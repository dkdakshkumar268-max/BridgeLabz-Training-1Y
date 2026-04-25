package com.gla.generics;

import java.util.ArrayList;
import java.util.List;

abstract class CourseType
{
    String courseName;

    public CourseType(String courseName)
    {
        this.courseName = courseName;
    }

    public abstract void evaluate();
}
class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " evaluated via Exams");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " evaluated via Assignments");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println(courseName + " evaluated via Research");
    }
}
class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    // Add course
    public void addCourse(T course) {
        courses.add(course);
    }

    // Get courses
    public List<T> getCourses() {
        return courses;
    }

    // Display evaluation
    public void evaluateCourses() {
        for (T c : courses) {
            c.evaluate();
        }
    }
}
public class MultilevelUniversityCourseManagementSystem {
    public static void displayAllCourses(List<? extends CourseType> list) {
        for (CourseType c : list) {
            c.evaluate();
        }
    }
        public static void main()
    {
            Course<ExamCourse> examCourses = new Course<>();
            examCourses.addCourse(new ExamCourse("Math"));
            examCourses.addCourse(new ExamCourse("Physics"));
            Course<AssignmentCourse> assignmentCourses = new Course<>();
            assignmentCourses.addCourse(new AssignmentCourse("History"));
            Course<ResearchCourse> researchCourses = new Course<>();
            researchCourses.addCourse(new ResearchCourse("AI Research"));
            System.out.println("Exam Courses:");
            examCourses.evaluateCourses();
            System.out.println("\nAssignment Courses:");
            assignmentCourses.evaluateCourses();
            System.out.println("\nResearch Courses:");
            researchCourses.evaluateCourses();
            System.out.println("\nAll Courses (Wildcard):");
            displayAllCourses(examCourses.getCourses());
            displayAllCourses(assignmentCourses.getCourses());
            displayAllCourses(researchCourses.getCourses());
        }
    }
