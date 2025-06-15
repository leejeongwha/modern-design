package org.example.moderndesign.adapter;

public class Main {
    public static void main(String[] args) {
        leagcy();
        lambda();
    }

    /**
     * 기존 시스템은 LegacyPaymentProcessor(레거시 결제 API)를 사용하고,
     * 새로운 시스템은 ModernPaymentGateway(현대 결제 API 인터페이스)를 요구합니다.
     * 어댑터를 통해 레거시 결제 시스템을 현대 인터페이스에 맞게 연결
     */
    private static void leagcy() {
        LegacyPaymentProcessor legacy = new LegacyPaymentProcessor();
        ModernPaymentGateway gateway = new PaymentProcessorAdapter(legacy);
        gateway.processPayment(new PaymentDetails("user123", 5000.0));
    }

    /**
     * 별도의 Adapter 클래스를 만들지 않고, 람다로 필요한 변환(매핑)만 간결하게 구현
     */
    private static void lambda() {
        // 람다로 Adapter 역할 구현
        ModernPaymentGateway gateway = details ->
            new LegacyPaymentProcessor().processPaymentOld(details.getAccountId(), details.getAmount());

        gateway.processPayment(new PaymentDetails("user123", 5000.0));
    }
}
