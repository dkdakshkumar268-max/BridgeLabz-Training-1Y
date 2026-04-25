package com.gla.collections;
import java.util.*;
public class RemovingDuplicates
{
    public static <T> List<T> removeDuplicates(List<T> list)
    {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }
    public static void main(String[] args)
    {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = removeDuplicates(input);
        System.out.println(result);
    }
}
