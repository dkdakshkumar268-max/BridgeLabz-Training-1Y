package com.gla.interfaces.DefaultMethodsinInterfaces.SmartVehicleDashboard;
public class SmartVehicleDashboardDemo {
    public static void main(String[] args) {
        Vehicle normalCar = new Car();
        Vehicle electricCar = new ElectricCar();
        normalCar.displaySpeed();
        normalCar.displayBattery();
        electricCar.displaySpeed();
        electricCar.displayBattery();
    }
}