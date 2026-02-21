package com.gla.interfaces.DefaultMethodsinInterfaces.PaymentGatewayIntegration;
public interface PaymentProcessor {
    void processPayment(double amount);
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed.");
    }
}