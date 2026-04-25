package com.gla.generics;

interface MealPlan
{
    void showPlan();
}
class VegetarianMeal implements MealPlan
{
    public void showPlan()
    {
        System.out.println("Vegetarian Meal: Salad + Paneer + Fruits");
    }
}

class VeganMeal implements MealPlan
{
    public void showPlan()
    {
        System.out.println("Vegan Meal: Tofu + Veggies + Nuts");
    }
}

class KetoMeal implements MealPlan
{
    public void showPlan()
    {
        System.out.println("Keto Meal: Eggs + Avocado + Chicken");
    }
}

class HighProteinMeal implements MealPlan
{
    public void showPlan()
    {
        System.out.println("High Protein Meal: Chicken + Lentils + Protein Shake");
    }
}
class Meal<T extends MealPlan>
{
    private T meal;

    public void setMeal(T meal)
    {
        this.meal = meal;
    }

    public T getMeal()
    {
        return meal;
    }

    public void displayMeal()
    {
        meal.showPlan();
    }
}
class MealGenerator
{
    public static <T extends MealPlan> void generateMeal(T meal)
    {
        System.out.println("Generating your personalized meal plan...");
        meal.showPlan();
    }
}
public class PersonalizedMealPlanGenerator
{
    public static void main(String[] args)
    {
        Meal<VegetarianMeal> vegMeal = new Meal<>();
        vegMeal.setMeal(new VegetarianMeal());
        vegMeal.displayMeal();
        Meal<VeganMeal> veganMeal = new Meal<>();
        veganMeal.setMeal(new VeganMeal());
        veganMeal.displayMeal();
        MealGenerator.generateMeal(new KetoMeal());
        MealGenerator.generateMeal(new HighProteinMeal());
    }
}
