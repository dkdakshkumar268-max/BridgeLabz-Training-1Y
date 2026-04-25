package com.gla.collections;

import java.util.*;

class Booking implements Comparable<Booking> {
    String user;
    String event;
    boolean isVIP;
    Booking(String user, String event, boolean isVIP) {
        this.user = user;
        this.event = event;
        this.isVIP = isVIP;
    }
    @Override
    public int compareTo(Booking b) {
        if (this.isVIP == b.isVIP) return 0;
        return this.isVIP ? -1 : 1; // VIP comes first
    }
    @Override
    public String toString() {
        return user + " | Event: " + event + " | VIP: " + isVIP;
    }
}
public class EventTicketReservationSystem {
    public static void main(String[] args) {
        Set<String> users = new HashSet<>();
        Queue<Booking> normalQueue = new LinkedList<>();
        PriorityQueue<Booking> vipQueue = new PriorityQueue<>();
        List<Booking> confirmedBookings = new ArrayList<>();
        registerUser(users, "Akshat");
        registerUser(users, "Aditya");
        registerUser(users, "Shikhar");
        registerUser(users, "Aman");
        addBooking(users, normalQueue, vipQueue, new Booking("Akshat", "Concert", false));
        addBooking(users, normalQueue, vipQueue, new Booking("Aditya", "Concert", true));
        addBooking(users, normalQueue, vipQueue, new Booking("Shikhar", "Concert", false));
        System.out.println("\nProcessing Bookings:");
        while (!vipQueue.isEmpty()) {
            Booking b = vipQueue.poll();
            System.out.println("Confirming VIP: " + b);
            confirmedBookings.add(b);
        }
        while (!normalQueue.isEmpty()) {
            Booking b = normalQueue.poll();
            System.out.println("Confirming: " + b);
            confirmedBookings.add(b);
        }
        System.out.println("\n Confirmed Bookings:");
        for (Booking b : confirmedBookings) {
            System.out.println(b);
        }
    }
    static void registerUser(Set<String> users, String name) {
        if (users.add(name)) {
            System.out.println("Registered: " + name);
        } else {
            System.out.println("Duplicate User Ignored: " + name);
        }
    }
    static void addBooking(Set<String> users,Queue<Booking> normalQ,PriorityQueue<Booking> vipQ,Booking b) {
        if (!users.contains(b.user)) {
            System.out.println("User not registered: " + b.user);
            return;
        }
        if (b.isVIP) {
            vipQ.add(b);
        } else {
            normalQ.add(b);
        }
    }
}