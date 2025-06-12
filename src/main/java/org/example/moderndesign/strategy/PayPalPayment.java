package org.example.moderndesign.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        log.info("Paid " + amount + " using PayPal.");
    }
}
