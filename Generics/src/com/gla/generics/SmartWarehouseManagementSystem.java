package com.gla.generics;
import java.util.ArrayList;
import java.util.List;
abstract class WarehouseItem
{
    String name;
    public WarehouseItem(String name)
    {
        this.name = name;
    }
    public abstract void display();
}
class Electronics extends WarehouseItem
{
    public Electronics(String name)
    {
        super(name);
    }
    @Override
    public void display()
    {
        System.out.println("Electronics: " + name);
    }
}
class Groceries extends WarehouseItem
{
    public Groceries(String name)
    {
        super(name);
    }
    @Override
    public void display()
    {
        System.out.println("Groceries: " + name);
    }
}
class Furniture extends WarehouseItem
{
    public Furniture(String name)
    {
        super(name);
    }
    @Override
    public void display()
    {
        System.out.println("Furniture: " + name);
    }
}
class Storage<T extends WarehouseItem>
{
    private List<T> items = new ArrayList<>();
    public void addItem(T item)
    {
        items.add(item);
    }
    public List<T> getItems()
    {
        return items;
    }
    public void displayItems()
    {
        for (T item : items)
        {
            item.display();
        }
    }
}
public class SmartWarehouseManagementSystem
{
    public static void displayAll(List<? extends WarehouseItem> items)
    {
        for (WarehouseItem item : items)
        {
            item.display();
        }
}
    public static void main(String[] args)
    {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("TV"));
        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Rice"));
        groceryStorage.addItem(new Groceries("Milk"));
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));
        System.out.println("Electronics Storage:");
        electronicsStorage.displayItems();
        System.out.println("\nGroceries Storage:");
        groceryStorage.displayItems();
        System.out.println("\nFurniture Storage:");
        furnitureStorage.displayItems();
        System.out.println("\nDisplay All (Wildcard):");
        displayAll(electronicsStorage.getItems());
        displayAll(groceryStorage.getItems());
        displayAll(furnitureStorage.getItems());
    }
}
