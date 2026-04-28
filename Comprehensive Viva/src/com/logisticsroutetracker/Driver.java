package com.logisticsroutetracker;

import java.util.*;
class Driver {
    String driverId, name;
    LinkedList<Checkpoint> route = new LinkedList<>();

    Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
    }

    void addCheckpoint(Checkpoint c) {
        route.add(c);
    }

    double totalDistance() {
        double sum = 0;
        for (Checkpoint c : route) {
            sum += c.distanceFromLast;
        }
        return sum;
    }

    double totalPenalty() {
        double sum = 0;
        for (Checkpoint c : route) {
            sum += c.calculatePenalty();
        }
        return sum;
    }

    boolean checkConsistency() {
        boolean hasDelivery = false;
        boolean hasFuel = false;
        for (Checkpoint c : route) {
            if (c.isCritical()) {
                if (c.getType().equals("Delivery"))
                    hasDelivery = true;
                if (c.getType().equals("Fuel"))
                    hasFuel = true;
            }
        }
        return hasDelivery && hasFuel;
    }

    void printRoute() {
        int i = 1;
        for (Checkpoint c : route) {
            String status = c.isDelayed() ? "Delayed" : "On Time";
            System.out.println(i++ + ". " + c.getType() + " – " + c.locationName + " – " + status + " – Penalty: " + c.calculatePenalty());
        }
    }
    void printSummary(){
        System.out.println("Driver: "+driverId+" – "+name);
        System.out.println("Route Summary:");
        printRoute();
        double dist=totalDistance();
        double pen=totalPenalty();
        double score=dist-pen;
        System.out.println("Total Distance: "+dist+" km");
        System.out.println("Total Penalty: "+pen);
        System.out.println("Route Score: "+score);
        System.out.println("Critical Route Check: "+(checkConsistency()?"All required checkpoints present" : "Missing critical checkpoints"));
    }
}