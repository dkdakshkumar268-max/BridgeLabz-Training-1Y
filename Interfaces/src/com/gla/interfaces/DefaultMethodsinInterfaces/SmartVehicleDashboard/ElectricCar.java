package com.gla.interfaces.DefaultMethodsinInterfaces.SmartVehicleDashboard;
public class ElectricCar implements Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Electric Car speed: 60 km/h");
    }
    @Override
    public void displayBattery() {
        System.out.println("Battery level: 75%");
    }
}