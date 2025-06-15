package org.example.moderndesign.adapter;

public class PaymentProcessorAdapter implements ModernPaymentGateway {
    private LegacyPaymentProcessor legacyProcessor;

    public PaymentProcessorAdapter(LegacyPaymentProcessor legacyProcessor) {
        this.legacyProcessor = legacyProcessor;
    }

    @Override
    public void processPayment(PaymentDetails details) {
        legacyProcessor.processPaymentOld(details.getAccountId(), details.getAmount());
    }
}
