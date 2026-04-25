package com.gla.streamapi;

import java.util.*;
public class CustomerDisplay {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("akshat", "shikhar", "amit", "praveen");
        names.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
