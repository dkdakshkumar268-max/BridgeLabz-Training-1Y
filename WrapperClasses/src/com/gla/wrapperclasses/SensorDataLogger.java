package com.gla.wrapperclasses;

import java.util.*;
public class SensorDataLogger {
    public static void logTemperature(Double temp, ArrayList<Double> dataList) {
        if (temp == null) {
            System.out.println("Null value received, skipping...");
            return;
        }
        dataList.add(temp);
        System.out.println("Logged temperature: " + temp);
    }
    public static void main(String[] args) {
        ArrayList<Double> temperatureData = new ArrayList<>();
        double temp1 = 25.5;
        Double temp2 = 30.2;
        Double temp3 = null;
        logTemperature(temp1, temperatureData);
        logTemperature(temp2, temperatureData);
        logTemperature(temp3, temperatureData);
        System.out.println("\nStored Data: " + temperatureData);
        double sum = 0;
        for (int i = 0; i < temperatureData.size(); i++) {
            sum += temperatureData.get(i);
        }
        System.out.println("Total Temperature Sum: " + sum);
    }
}
