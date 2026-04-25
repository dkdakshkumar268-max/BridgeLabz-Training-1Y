package com.gla.collections;

import java.util.*;
class Package {
    String id;
    String address;
    Package(String id, String address) {
        this.id = id;
        this.address = address;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Address: " + address;
    }
}
public class WarehouseDeliveryTrackingSystem {
    public static void main(String[] args) {
        Queue<Package> deliveryQueue = new LinkedList<>();
        Set<String> packageIds = new HashSet<>();
        List<Package> delivered = new ArrayList<>();
        Stack<Package> returned = new Stack<>();
        addPackage(packageIds, deliveryQueue, new Package("P101", "Delhi"));
        addPackage(packageIds, deliveryQueue, new Package("P102", "Mumbai"));
        addPackage(packageIds, deliveryQueue, new Package("P103", "Noida"));
        addPackage(packageIds, deliveryQueue, new Package("P101", "Delhi"));
        Random rand = new Random();
        while (!deliveryQueue.isEmpty()) {
            Package p = deliveryQueue.poll();
            System.out.println("Delivering: " + p);
            if (rand.nextBoolean()) {
                delivered.add(p);
            } else {
                returned.push(p);
            }
        }
        System.out.println("\n Delivered Packages:");
        for (Package p : delivered) {
            System.out.println(p);
        }
        System.out.println("\n Returned Packages:");
        while (!returned.isEmpty()) {
            System.out.println(returned.pop());
        }
        System.out.println("\n Summary:");
        System.out.println("Total Delivered: " + delivered.size());
        System.out.println("Total Returned: " + returned.size());
    }
    static void addPackage(Set<String> ids, Queue<Package> queue, Package p) {
        if (ids.add(p.id)) {
            queue.add(p);
            System.out.println("Added: " + p.id);
        } else {
            System.out.println("Duplicate Package Ignored: " + p.id);
        }
    }
}