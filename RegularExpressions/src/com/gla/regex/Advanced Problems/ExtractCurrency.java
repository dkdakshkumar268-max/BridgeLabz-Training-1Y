package com.gla.regex;

import java.util.regex.*;
import java.util.*;
public class ExtractCurrency {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";
        String pattern = "\\$\\d+\\.\\d{2}|\\b\\d+\\.\\d{2}\\b";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        List<String> result = new ArrayList<>();
        while (m.find()) {
            result.add(m.group());
        }
        System.out.println(String.join(", ", result));
    }
}
