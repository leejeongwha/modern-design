package org.example.moderndesign.strategy;

@FunctionalInterface
public interface PaymentStrategy {
    void pay(int amount);

    default void checkValid() {
        System.out.println("Checking payment validity...");
    }

    default void sendResult() {
        System.out.println("Send Result...");
    }
}
