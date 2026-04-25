package com.gla.generics;
import java.util.List;
public class CopyListElements
{
    public static void copyList(List<? super Number> dest, List<? extends Number> src)
    {
        for (Number num : src)
        {
            dest.add(num);
        }
    }
    public static void main(String[] args)
    {
        List<Integer> source = List.of(1, 2, 3, 4);
        List<Number> destination = new java.util.ArrayList<>();
        copyList(destination, source);
        System.out.println(destination);
    }
}
