package com.gla.regex;

public class CreditCardValidator {
    public static boolean isValidCard(String cardNumber) {
        String visaPattern = "^4\\d{15}$";
        String masterPattern = "^5\\d{15}$";
        return cardNumber.matches(visaPattern) || cardNumber.matches(masterPattern);
    }
    public static void main(String[] args) {
        String card1 = "4123456789012345";
        String card2 = "5123456789012345";
        String card3 = "3123456789012345";
        System.out.println(isValidCard(card1));
        System.out.println(isValidCard(card2));
        System.out.println(isValidCard(card3));
    }
}
