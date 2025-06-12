package org.example.moderndesign.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaymentHandler {
    static final PaymentStrategy creditCardPayment = amount ->
        log.info("Paid " + amount + " using Credit Card.");

    static final PaymentStrategy payPalPayment = amount ->
        log.info("Paid " + amount + " using PayPal.");
}
