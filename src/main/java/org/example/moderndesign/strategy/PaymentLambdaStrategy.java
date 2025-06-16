package org.example.moderndesign.strategy;

public class PaymentLambdaStrategy {
    static final PaymentStrategy creditCardPayment = amount ->
        System.out.println("Paid " + amount + " using Credit Card.");

    static final PaymentStrategy payPalPayment = amount ->
        System.out.println("Paid " + amount + " using PayPal.");
}
