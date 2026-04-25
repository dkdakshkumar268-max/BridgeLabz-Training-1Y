package com.gla.streamapi;

import java.util.*;
import java.util.stream.Collectors;
class Claim {
    String type;
    double amount;
    public Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    public String getType() {
        return type;
    }
    public double getAmount() {
        return amount;
    }
}
public class InsuranceAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("Health", 5000),
                new Claim("Vehicle", 12000),
                new Claim("Health", 8000),
                new Claim("Life", 15000),
                new Claim("Vehicle", 10000));
        Map<String, Double> avgByType = claims.stream().collect(Collectors.groupingBy(Claim::getType,Collectors.averagingDouble(Claim::getAmount)));
        avgByType.forEach((type, avg)->System.out.println(type+" → Average: "+avg));
    }
}