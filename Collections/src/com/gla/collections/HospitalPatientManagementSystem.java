package com.gla.collections;

import java.util.*;

class Patient {
    int id;
    String name;
    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;
        Patient p = (Patient) o;
        return id == p.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        return id + " | " + name;
    }
}
public class HospitalPatientManagementSystem {
    public static void main(String[] args) {
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> waitingQueue = new LinkedList<>();
        Stack<Patient> dischargedStack = new Stack<>();
        List<Patient> history = new ArrayList<>();
        admit(admitted, waitingQueue, history, new Patient(1, "Akshat"));
        admit(admitted, waitingQueue, history, new Patient(2, "Shikhar"));
        admit(admitted, waitingQueue, history, new Patient(3, "Praveen"));
        admit(admitted, waitingQueue, history, new Patient(1, "Shivendra"));
        System.out.println("\nTreating Patients:");
        while (!waitingQueue.isEmpty()) {
            Patient p = waitingQueue.poll();
            System.out.println("Treating: " + p);
            admitted.remove(p);
            dischargedStack.push(p);
        }
        if (!dischargedStack.isEmpty()) {
            Patient p = dischargedStack.pop();
            System.out.println("\nRe-admitting: " + p);
            admitted.add(p);
            waitingQueue.add(p);
        }
        System.out.println("\n Admitted Patients:");
        for (Patient p : admitted) {
            System.out.println(p);
        }
        System.out.println("\n Patient History:");
        for (Patient p : history) {
            System.out.println(p);
        }
    }
    static void admit(Set<Patient> admitted,Queue<Patient> queue,List<Patient> history,Patient p) {
        if (admitted.add(p)) {
            queue.add(p);
            history.add(p);
            System.out.println("Admitted: " + p);
        } else {
            System.out.println("Duplicate Patient Ignored: " + p);
        }
    }
}
