package com.gla.regex;

import java.util.regex.*;
import java.util.*;
public class ExtractLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String pattern = "\\b(Java|Python|JavaScript|Go|C|C\\+\\+|C#|Ruby|Swift|Kotlin)\\b";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        List<String> result = new ArrayList<>();
        while (m.find()) {
            result.add(m.group());
        }
        System.out.println(String.join(", ", result));
    }
}
