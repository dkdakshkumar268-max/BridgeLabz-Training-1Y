package com.gla.collections;
import java.util.*;
class Question {
    int id;
    String text;
    public Question(int id, String text) {
        this.id = id;
        this.text = text;
    }
    @Override
    public String toString() {
        return "Q" + id + ": " + text;
    }
}
class Student {
    String studentId;
    String name;
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }
    @Override
    public String toString() {
        return studentId + " | " + name;
    }
}
class ExamSystem {
    List<Question> questionList = new ArrayList<>();
    Set<String> studentSet = new HashSet<>();
    Queue<Student> studentQueue = new LinkedList<>();
    Stack<Question> navigationStack = new Stack<>();
    public void enrollStudent(Student s) {
        if (studentSet.add(s.studentId)) {
            studentQueue.add(s);
            System.out.println("Enrolled: " + s);
        } else {
            System.out.println("Duplicate ID! Not allowed: " + s.studentId);
        }
    }
    public void addQuestion(Question q) {
        questionList.add(q);
    }
    public void shuffleQuestions() {
        Collections.shuffle(questionList);
        System.out.println("\nQuestions shuffled!");
    }
    public void serveStudents() {
        System.out.println("\nServing Students:");
        while (!studentQueue.isEmpty()) {
            Student s = studentQueue.poll();
            System.out.println("Now taking exam: " + s);
        }
    }
    public void startExam() {
        System.out.println("\nStarting Exam:");
        for (Question q : questionList) {
            navigationStack.push(q);
            System.out.println("Displaying: " + q);
        }
    }
    public void goBack() {
        if (!navigationStack.isEmpty()) {
            navigationStack.pop();
            if (!navigationStack.isEmpty()) {
                System.out.println("Back to: " + navigationStack.peek());
            } else {
                System.out.println("No previous questions.");
            }
        }
    }
}
public class OnlineExamManagementSystem {
    public static void main(String[] args) {
        ExamSystem system = new ExamSystem();
        system.enrollStudent(new Student("S1", "Akshat"));
        system.enrollStudent(new Student("S2", "Rahul"));
        system.enrollStudent(new Student("S1", "Duplicate")); // duplicate
        system.addQuestion(new Question(1, "What is Java?"));
        system.addQuestion(new Question(2, "Explain OOP concepts."));
        system.addQuestion(new Question(3, "What is a Stack?"));
        system.shuffleQuestions();
        system.serveStudents();
        system.startExam();
        system.goBack();
    }
}
