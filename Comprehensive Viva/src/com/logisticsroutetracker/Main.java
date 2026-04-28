package com.logisticsroutetracker;

public class Main {
    public static void main(String[] args){
        Driver d = new Driver("D1204","Kavita Nair");
        d.addCheckpoint(new DeliveryCheckpoint("C1","Warehouse A",40, 30, 40));
        d.addCheckpoint(new FuelCheckpoint("C2","Pump 12",20,15, 15));
        d.addCheckpoint(new RestCheckpoint("C3","Motel X",10,20, 25));
        d.addCheckpoint(new DeliveryCheckpoint("C4","Client Hub",50, 30, 45));
        d.printSummary();
    }
}
