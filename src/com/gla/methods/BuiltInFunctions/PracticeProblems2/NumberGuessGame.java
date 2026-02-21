package com.gla.methods.BuiltInFunctions.PracticeProblems2;
import java.util.Scanner;
public class NumberGuessGame {
    static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }
    static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.next().toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            String feedback = getFeedback(sc);
            if (feedback.equals("correct")) {
                System.out.println("Guessed correctly!");
                break;
            }
            else if (feedback.equals("high")) {
                high = guess - 1;
            }
            else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
    }
}