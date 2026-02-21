package com.gla.methods.BuiltInFunctions.PracticeProblems1;
import java.util.Scanner;
public class DateFormattingBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day month year: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("dd/MM/yyyy : " + d + "/" + m + "/" + y);
        System.out.println("yyyy-MM-dd : " + y + "-" + m + "-" + d);
        String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        System.out.println("Formatted : " + d + " " + months[m-1] + " " + y);
    }
}