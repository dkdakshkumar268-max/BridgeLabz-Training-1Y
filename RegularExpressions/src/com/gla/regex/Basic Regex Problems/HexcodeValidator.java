package com.gla.regex;

public class HexcodeValidator {
    public static void main(String[] args) {
        String regex = "^#[0-9A-Fa-f]{6}$";
        String[] testCases = {"#FFA500", "#ff4500", "#123"};
        for (String color : testCases) {
            if (color.matches(regex)) {
                System.out.println(color + " → Valid");
            } else {
                System.out.println(color + " → Invalid");
            }
        }
    }
}
