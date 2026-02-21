package com.gla.interfaces.DefaultMethodsinInterfaces.SmartVehicleDashboard;
public interface Vehicle {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery information not available.");
    }
}