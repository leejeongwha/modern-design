package org.example.moderndesign.adapter;

public class LegacyPaymentProcessor {
    public void processPaymentOld(String accountId, double amount) {
        System.out.println("Legacy 결제 처리: " + accountId + ", " + amount);
    }
}
