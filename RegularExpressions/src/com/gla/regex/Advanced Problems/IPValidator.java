package com.gla.regex;

public class IPValidator {
    public static void main(String[] args) {
        String regex = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}"+"(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";
        String[] testCases = {"192.168.1.1","255.255.255.255","256.100.50.0","192.168.01.1"};
        for (String ip : testCases) {
            if (ip.matches(regex)) {
                System.out.println(ip + " → Valid");
            } else {
                System.out.println(ip + " → Invalid");
            }
        }
    }
}
