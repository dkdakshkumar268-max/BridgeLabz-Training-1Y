package com.gla.generics;
import java.util.List;
class Animal
{
    String name;
    public Animal(String name)
    {
        this.name = name;
    }
    public void makeSound()
    {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal
{
    public Dog(String name)
    {
        super(name);
    }
    @Override
    public void makeSound()
    {
        System.out.println(name + " says: Woof");
    }
}
class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }
    @Override
    public void makeSound()
    {
        System.out.println(name + " says: Meow");
    }
}
public class AnimalHierarchy
{
        public static void printAnimals(List<? extends Animal> animals)
        {
            for (Animal a : animals)
            {
                a.makeSound();
            }
        }
        public static void main(String[] args)
        {
            List<Dog> dogs = List.of(new Dog("Bruno"), new Dog("Tommy"));
            List<Cat> cats = List.of(new Cat("Kitty"), new Cat("Luna"));
            printAnimals(dogs);
            printAnimals(cats);
        }
}
