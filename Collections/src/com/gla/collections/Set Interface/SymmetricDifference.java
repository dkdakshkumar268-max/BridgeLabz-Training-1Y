package com.gla.collections;

import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> result1 = new HashSet<>(set1);
        result1.removeAll(set2);
        Set<Integer> result2 = new HashSet<>(set2);
        result2.removeAll(set1);
        result1.addAll(result2);
        System.out.println(result1);
    }
}
