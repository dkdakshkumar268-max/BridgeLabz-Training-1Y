package com.gla.wrapperclasses;

public class BankTransaction {
    public static double getRemainingLimit(Double limit, double withdrawnAmount) {
        if (limit == null) {
            return 0.0;
        }
        double remaining = limit - withdrawnAmount;
        if (remaining < 0) {
            return 0.0;
        }
        return remaining;
    }
    public static void main(String[] args) {
        Double limit1 = 5000.0;
        Double limit2 = null;
        double withdrawn = 1500.0;
        System.out.println("Remaining Limit: " + getRemainingLimit(limit1, withdrawn));
        System.out.println("Remaining Limit: " + getRemainingLimit(limit2, withdrawn));
    }
}
