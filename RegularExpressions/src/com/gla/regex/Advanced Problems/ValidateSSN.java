package com.gla.regex;

import java.util.regex.*;
public class ValidateSSN {
    public static void main(String[] args) {
        String text = "My SSN is 123-45-6789.";
        String pattern = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(" \"" + m.group() + "\" is valid");
        }
        String invalid = "123456789";
        if (!invalid.matches(pattern)) {
            System.out.println(" \"" + invalid + "\" is invalid");
        }
    }
}
