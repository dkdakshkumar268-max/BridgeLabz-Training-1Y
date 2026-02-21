package com.gla.methods.BuiltInFunctions.PracticeProblems1;
import java.util.Scanner;
public class DateComparisonBasic {
    static int compare(int d1, int m1, int y1,int d2, int m2, int y2) {
        if (y1 != y2)
            return y1 - y2;
        if (m1 != m2)
            return m1 - m2;
        return d1 - d2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date (d m y): ");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.print("Enter second date (d m y): ");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();
        int result = compare(d1, m1, y1, d2, m2, y2);
        if (result < 0)
            System.out.println("First date is BEFORE");
        else if (result > 0)
            System.out.println("First date is AFTER");
        else
            System.out.println("Both dates are SAME");
    }
}