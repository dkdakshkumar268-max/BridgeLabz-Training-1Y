package com.gla.collections;

import java.util.*;
public class WordFrequencyCounter {
    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        HashMap<String, Integer> map = new HashMap<>();
        input = input.toLowerCase().replaceAll("[^a-z0-9 ]", "");
        String[] words = input.split("\\s+");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
    }
}