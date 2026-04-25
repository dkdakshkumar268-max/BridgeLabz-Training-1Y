package com.gla.collections;

import java.util.*;

class Parcel implements Comparable<Parcel> {
    String id;
    String address;
    int priority;
    Parcel(String id, String address, int priority) {
        this.id = id;
        this.address = address;
        this.priority = priority;
    }
    @Override
    public int compareTo(Parcel p) {
        return p.priority - this.priority;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Address: " + address + ", Priority: " + priority;
    }
}
public class CourierDeliveryRoutingSystem {
    public static void main(String[] args) {
        PriorityQueue<Parcel> priorityQueue = new PriorityQueue<>();
        Queue<Parcel> normalQueue = new LinkedList<>();
        Set<String> parcelIds = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();
        addParcel(parcelIds, priorityQueue, normalQueue, new Parcel("P1", "Delhi", 5));
        addParcel(parcelIds, priorityQueue, normalQueue, new Parcel("P2", "Mumbai", 1));
        addParcel(parcelIds, priorityQueue, normalQueue,new Parcel("P3", "Noida", 4));
        addParcel(parcelIds, priorityQueue, normalQueue,new Parcel("P1", "Delhi", 3)); // duplicate
        System.out.println("\nAssigning Deliveries:");
        while (!priorityQueue.isEmpty()) {
            Parcel p = priorityQueue.poll();
            System.out.println("Delivering (High Priority): " + p);
            completed.add(p);
        }
        while (!normalQueue.isEmpty()) {
            Parcel p = normalQueue.poll();
            System.out.println("Delivering (Normal): " + p);
            completed.add(p);
        }
        System.out.println("\n Completed Deliveries:");
        for (Parcel p : completed) {
            System.out.println(p);
        }
        System.out.println("\n Total Deliveries: " + completed.size());
    }
    static void addParcel(Set<String> ids, PriorityQueue<Parcel> pq, Queue<Parcel> nq, Parcel p) {
        if (!ids.add(p.id)) {
            System.out.println("Duplicate Parcel Ignored: " + p.id);
            return;
        }
        if (p.priority >= 4) {
            pq.add(p);
        } else {
            nq.add(p);
        }
        System.out.println("Added Parcel: " + p.id);
    }
}