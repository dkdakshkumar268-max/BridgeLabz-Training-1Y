package com.gla.generics;
import java.util.List;
public class NumericSum
{
    public static double sumNumbers(List<? extends Number> list)
    {
        double sum = 0.0;
        for (Number num : list)
        {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args)
    {
        List<Integer> intList = List.of(1, 2, 3, 4);
        List<Double> doubleList = List.of(1.5, 2.5, 3.0);
        System.out.println("Sum of Integers: " + sumNumbers(intList));
        System.out.println("Sum of Doubles: " + sumNumbers(doubleList));
    }
}
