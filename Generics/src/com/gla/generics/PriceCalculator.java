package com.gla.generics;

import java.util.List;

class Product
{
    double price;
    public Product(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }
}
class Mobile extends Product
{
    String name;
    public Mobile(String name, double price)
    {
        super(price);
        this.name = name;
    }
}
class Laptop extends Product
{
    String name;
    public Laptop(String name, double price) {
        super(price);
        this.name = name;
    }
}
public class PriceCalculator
{
    public static double calculateTotal(List<? extends Product> items)
    {
        double total = 0;
        for (Product p : items)
        {
            total += p.getPrice();
        }
        return total;
    }
    public static void main(String[] args)
    {
        List<Mobile> mobiles = List.of(new Mobile("iPhone", 70000), new Mobile("Samsung", 50000));
        List<Laptop> laptops = List.of(new Laptop("Dell", 80000), new Laptop("HP", 60000));
        System.out.println("Total Mobile Price: " + calculateTotal(mobiles));
        System.out.println("Total Laptop Price: " + calculateTotal(laptops));
    }
}
