package com.gla.collections;
import java.util.*;
public class SortedList {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list);
    }
}
