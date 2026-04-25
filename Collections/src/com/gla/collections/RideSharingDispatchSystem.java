package com.gla.collections;
import java.util.*;
class RideRequest implements Comparable<RideRequest> {
    int requestId;
    String customerName;
    int priority;
    public RideRequest(int requestId, String customerName, int priority) {
        this.requestId = requestId;
        this.customerName = customerName;
        this.priority = priority;
    }
    @Override
    public int compareTo(RideRequest r) {

        return this.priority - r.priority;
    }
    @Override
    public String toString() {

        return requestId + " | " + customerName + " | Priority: " + priority;
    }
}
class Driver {
    int driverId;
    String name;
    public Driver(int driverId, String name)
    {
        this.driverId = driverId;
        this.name = name;
    }
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver d = (Driver) o;
        return this.driverId == d.driverId;
    }
    @Override
    public int hashCode() {

        return Integer.hashCode(driverId);
    }
    @Override
    public String toString() {

        return driverId + " | " + name;
    }
}
class Ride {
    RideRequest request;
    Driver driver;

    public Ride(RideRequest request, Driver driver) {
        this.request = request;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Ride: " + request + " -> Driver: " + driver;
    }
}
class RideSystem {

    Queue<RideRequest> requestQueue = new LinkedList<>();
    PriorityQueue<RideRequest> priorityQueue = new PriorityQueue<>();
    Set<Driver> availableDrivers = new HashSet<>();
    List<Ride> completedRides = new ArrayList<>();
    public void addRequest(RideRequest r) {
        requestQueue.add(r);
        priorityQueue.add(r);
        System.out.println("Request Added: " + r);
    }
    public void addDriver(Driver d) {
        availableDrivers.add(d);
    }
    public void assignRide() {
        if (priorityQueue.isEmpty() || availableDrivers.isEmpty()) {
            System.out.println("No rides or drivers available.");
            return;
        }
        RideRequest request = priorityQueue.poll();
        Driver driver = availableDrivers.iterator().next();
        availableDrivers.remove(driver);
        Ride ride = new Ride(request, driver);
        completedRides.add(ride);
        System.out.println("Assigned: " + ride);
    }
    public void showCompletedRides() {
        System.out.println("\nCompleted Rides:");
        for (Ride r : completedRides) {
            System.out.println(r);
        }
    }
}
public class RideSharingDispatchSystem {
    public static void main(String[] args) {
        RideSystem system = new RideSystem();
        system.addDriver(new Driver(1, "Driver A"));
        system.addDriver(new Driver(2, "Driver B"));
        system.addRequest(new RideRequest(101, "Akshat", 2));
        system.addRequest(new RideRequest(102, "Rahul", 1));
        system.addRequest(new RideRequest(103, "Amit", 3));
        system.assignRide();
        system.assignRide();
        system.assignRide();
        system.showCompletedRides();
    }
}
