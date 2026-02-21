package com.gla.interfaces.DefaultMethodsinInterfaces.PaymentGatewayIntegration;
public class PaymentGatewayIntegrationDemo {
    public static void main(String[] args) {
        PaymentProcessor payment = new Razorpay();
        payment.processPayment(1000);
        payment.refund(500);
    }
}