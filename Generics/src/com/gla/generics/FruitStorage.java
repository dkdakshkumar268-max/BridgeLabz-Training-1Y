package com.gla.generics;
import java.util.ArrayList;
class Fruit
{
    String name;
    public Fruit(String name)
    {
        this.name = name;
    }
    public void display()
    {
        System.out.println("Fruit: " + name);
    }
}
class Apple extends Fruit
{
    public Apple(String name)
    {
        super(name);
    }
}

class Mango extends Fruit
{
    public Mango(String name)
    {
        super(name);
    }
}

class FruitBox<T extends Fruit>
{
    private ArrayList<T> fruits = new ArrayList<>();
    public void add(T fruit)
    {
        fruits.add(fruit);
    }
    public void displayFruits()
    {
        for (T fruit : fruits)
        {
            fruit.display();
        }
    }
}
public class FruitStorage
{
    public static void main(String[] args)
    {

        FruitBox<Apple> appleBox = new FruitBox<>();
        appleBox.add(new Apple("Red Apple"));
        appleBox.add(new Apple("Green Apple"));
        appleBox.displayFruits();
        FruitBox<Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Mango("Alphonso Mango"));
        mangoBox.displayFruits();
    }
}
