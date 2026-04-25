package com.gla.streamapi;

import java.time.LocalDate;
import java.util.*;
class Member {
    String name;
    LocalDate expiryDate;
    public Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    @Override
    public String toString() {
        return name + " | Expiry: " + expiryDate;
    }
}
public class GymSystem {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
                new Member("Akshat", LocalDate.now().plusDays(10)),
                new Member("Shikhar", LocalDate.now().plusDays(40)),
                new Member("Amit", LocalDate.now().plusDays(25)),
                new Member("Praveen", LocalDate.now().plusDays(5)));
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);
        members.stream().filter(m->!m.getExpiryDate().isBefore(today)&&!m.getExpiryDate().isAfter(next30Days)).forEach(System.out::println);
    }
}