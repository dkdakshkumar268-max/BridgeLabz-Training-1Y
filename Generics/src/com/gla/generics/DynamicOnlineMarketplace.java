package com.gla.generics;

import java.util.ArrayList;
import java.util.List;

class BookCategory
{
    String type;
    public BookCategory(String type)
    {
        this.type = type;
    }
}
class ClothingCategory
{
    String type;
    public ClothingCategory(String type)
    {
        this.type = type;
    }
}
class GadgetCategory
{
    String type;
    public GadgetCategory(String type)
    {
        this.type = type;
    }
}
class Product<T>
{
    String name;
    double price;
    T category;

    public Product(String name, double price, T category)
    {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void display()
    {
        System.out.println(name + " | Price: " + price + " | Category: " + category.getClass().getSimpleName());
    }
}
class Marketplace
{

    public static <T extends Product<?>> void applyDiscount(T product, double percentage)
    {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}
class Catalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void displayCatalog() {
        for (Product<?> p : products) {
            p.display();
        }
    }

    public class DynamicOnlineMarketplace {
        public static void main(String[] args) {
            Product<BookCategory> book = new Product<>("Java Book", 500, new BookCategory("Education"));

            Product<ClothingCategory> shirt = new Product<>("T-Shirt", 1000, new ClothingCategory("Casual"));

            Product<GadgetCategory> phone = new Product<>("Smartphone", 20000, new GadgetCategory("Electronics"));
            Marketplace.applyDiscount(book, 10);
            Marketplace.applyDiscount(shirt, 20);
            Marketplace.applyDiscount(phone, 5);
            Catalog catalog = new Catalog();
            catalog.addProduct(book);
            catalog.addProduct(shirt);
            catalog.addProduct(phone);
            catalog.displayCatalog();
        }
    }
}