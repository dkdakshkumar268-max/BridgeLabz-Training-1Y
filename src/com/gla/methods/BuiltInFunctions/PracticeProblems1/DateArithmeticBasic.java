package com.gla.methods.BuiltInFunctions.PracticeProblems1;
import java.util.Scanner;
public class DateArithmeticBasic {
    static int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
    static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
    static int getDays(int month, int year) {
        if (month == 2 && isLeap(year))
            return 29;
        return daysInMonth[month - 1];
    }
    static void addDays(int[] date, int daysToAdd) {
        date[0] += daysToAdd;
        while (date[0] > getDays(date[1], date[2])) {
            date[0] -= getDays(date[1], date[2]);
            date[1]++;
            if (date[1] > 12) {
                date[1] = 1;
                date[2]++;
            }
        }
    }
    static void subtractDays(int[] date, int daysToSub) {
        date[0] -= daysToSub;
        while (date[0] <= 0) {
            date[1]--;
            if (date[1] <= 0) {
                date[1] = 12;
                date[2]--;
            }
            date[0] += getDays(date[1], date[2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day month year: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        int[] date = {d, m, y};
        addDays(date, 7);
        date[1] += 1;
        date[2] += 2;
        subtractDays(date, 21);
        System.out.println("Final Date: " + date[0] + "-" + date[1] + "-" + date[2]);
    }
}