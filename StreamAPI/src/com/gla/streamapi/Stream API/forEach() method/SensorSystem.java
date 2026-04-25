package com.gla.streamapi;

import java.util.*;
public class SensorSystem {
    public static void main(String[] args) {
        List<Double> readings = Arrays.asList(23.5, 45.2, 12.8, 67.0, 30.1);
        double threshold = 30.0;
        readings.stream().filter(r -> r > threshold).forEach(r -> System.out.println("High Reading: "+r));
    }
}