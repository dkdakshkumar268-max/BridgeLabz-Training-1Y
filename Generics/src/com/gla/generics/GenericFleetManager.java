package com.gla.generics;
import java.util.ArrayList;
class Vehicle
{
    String name;
    public Vehicle(String name)
    {
        this.name = name;
    }
    public void display()
    {
        System.out.println("Vehicle: " + name);
    }
}
class Truck extends Vehicle
{
    public Truck(String name)
    {
        super(name);
    }
    @Override
    public void display()
    {
        System.out.println("Truck: " + name);
    }
}
class Bike extends Vehicle
{
    public Bike(String name)
    {
        super(name);
    }
    @Override
    public void display()
    {
        System.out.println("Bike: " + name);
    }
}
class FleetManager<T extends Vehicle> {
    {
         ArrayList<T> fleet = new ArrayList<>();
         public void addVehicle(T Vehicle)
        {
            fleet.add(Vehicle);
        }
        public void showFleet()
        {
            for (T vehicle : fleet) {
                vehicle.display();
            }
        }
    }

    public class GenericFleetManager
    {
        public static void main(String[] args)
        {
            FleetManager<Truck> truckFleet = new FleetManager<>();
            truckFleet.addVehicle(new Truck("Volvo Truck"));
            truckFleet.addVehicle(new Truck("Tata Truck"));
            System.out.println("Truck Fleet:");
            truckFleet.showFleet();
            FleetManager<Bike> bikeFleet = new FleetManager<>();
            bikeFleet.addVehicle(new Bike("Yamaha"));
            bikeFleet.addVehicle(new Bike("Royal Enfield"));
            System.out.println("\nBike Fleet:");
            bikeFleet.showFleet();
        }
    }
}
