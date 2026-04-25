package com.gla.streamapi;

import java.util.*;
class Stock {
    String name;
    double price;
    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return name + " → " + price;
    }
}
public class StockLogger {
    public static void main(String[] args) {
        List<Stock> stocks = Arrays.asList(
                new Stock("AAPL", 190.5),
                new Stock("GOOGL", 2750.0),
                new Stock("TSLA", 720.3));
        stocks.forEach(System.out::println);
    }
}