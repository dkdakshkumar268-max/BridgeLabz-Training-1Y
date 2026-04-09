package com.gla.wrapperclasses;
import java.util.*;
public class EmployeeData {
    public static void main(String[] args) {
        int[] ages = {25, 32, 19, 45, 28, 50, 21};
        ArrayList<Integer> ageList = new ArrayList<>();
        for (int i = 0; i < ages.length; i++)
        {
            ageList.add(ages[i]);
        }
        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);
        System.out.println("Employee Ages: " + ageList);
        System.out.println("Youngest Age: " + youngest);
        System.out.println("Oldest Age: " + oldest);
    }
}