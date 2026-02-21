package com.gla.interfaces.DefaultMethodsinInterfaces.PaymentGatewayIntegration;
public class Razorpay implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment of ₹" + amount + " processed via Razorpay.");
    }
}