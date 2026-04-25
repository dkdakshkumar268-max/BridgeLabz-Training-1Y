package com.gla.streamapi;

import java.util.*;
class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;
    public Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }
    @Override
    public String toString() {
        return name + " | " + specialty +
                " | Weekend: " + availableOnWeekend;
    }
}
public class HospitalSystem {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. A", "Cardiology", true),
                new Doctor("Dr. B", "Neurology", false),
                new Doctor("Dr. C", "Orthopedics", true),
                new Doctor("Dr. D", "Dermatology", true),
                new Doctor("Dr. E", "Pediatrics", false)
        );
        doctors.stream().filter(d -> d.availableOnWeekend).sorted(Comparator.comparing(d -> d.specialty)).forEach(System.out::println);
    }
}
