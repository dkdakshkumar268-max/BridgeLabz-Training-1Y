package com.gla.generics;
import java.util.ArrayList;

class Electronics
{
    String name;
    public Electronics(String name)
    {
        this.name = name;
    }
    @Override
    public String toString()
    {
        return "Electronics: " + name;
    }
}
class Clothing
{
    String name;
    public Clothing(String name)
    {
        this.name = name;
    }
    @Override
    public String toString()
    {
        return "Clothing: " + name;
    }
}
class Book
{
    String name;

    public Book(String name)
    {
        this.name = name;
    }
    @Override
    public String toString()
    {
        return "Book: " + name;
    }
}
class Cart<T>
{
    private ArrayList<T> items = new ArrayList<>();
    public void addItem(T item)
    {
        items.add(item);
    }
    public void removeItem(T item)
    {
        items.remove(item);
    }
    public void displayItems()
    {
        for (T item : items)
        {
            System.out.println(item);
        }
    }
}
public class GenericCart {
    public static void main(String[] args)
    {
        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addItem(new Electronics("Laptop"));
        electronicsCart.addItem(new Electronics("Smartphone"));
        System.out.println("Electronics Cart:");
        electronicsCart.displayItems();
        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing("T-Shirt"));
        clothingCart.addItem(new Clothing("Jeans"));
        System.out.println("\nClothing Cart:");
        clothingCart.displayItems();
    }
}
