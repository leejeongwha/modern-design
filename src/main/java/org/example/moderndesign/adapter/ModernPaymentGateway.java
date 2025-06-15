package org.example.moderndesign.adapter;

@FunctionalInterface
public interface ModernPaymentGateway {
    void processPayment(PaymentDetails details);
}
