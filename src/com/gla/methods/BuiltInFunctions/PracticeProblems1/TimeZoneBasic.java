package com.gla.methods.BuiltInFunctions.PracticeProblems1;
import java.util.Scanner;
public class TimeZoneBasic {
    static int adjust(int hour, int offset) {
        int result = hour + offset;
        if (result >= 24) result -= 24;
        if (result < 0) result += 24;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current GMT hour (0-23): ");
        int gmt = sc.nextInt();
        System.out.println("GMT: " + gmt + ":00");
        System.out.println("IST: " + adjust(gmt, 5) + ":00");
        System.out.println("PST: " + adjust(gmt, -8) + ":00");
    }
}