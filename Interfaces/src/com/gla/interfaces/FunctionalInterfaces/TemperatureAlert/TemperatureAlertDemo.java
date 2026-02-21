package com.gla.interfaces.FunctionalInterfaces.TemperatureAlert;
public class TemperatureAlertDemo {
    public static void main(String[] args) {
        TemperatureCheck alert = temp -> temp > 40;
        double temperature = 42;
        if (alert.check(temperature)) {
            System.out.println("High Temperature Alert!");
        } else {
            System.out.println("Temperature is Normal.");
        }
    }
}