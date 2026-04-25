package com.gla.regex;

import java.util.regex.*;
import java.util.*;
public class RepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        String pattern = "\\b(\\w+)\\s+\\1\\b";
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);
        List<String> result = new ArrayList<>();
        while (m.find()) {
            result.add(m.group(1));
        }
        System.out.println(String.join(", ", result));
    }
}
