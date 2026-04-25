package com.gla.regex;

public class LicenseValidation {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}[0-9]{4}$";
        String[] testCases = {"AB1234", "A12345", "XY9999"};
        for (String plate : testCases) {
            if (plate.matches(regex)) {
                System.out.println(plate + " → Valid");
            } else {
                System.out.println(plate + " → Invalid");
            }
        }
    }
}
