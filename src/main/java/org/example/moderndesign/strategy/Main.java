package org.example.moderndesign.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        leagcy();
        lambda();

        //typeInferenceErrorExample();
    }

    private static void leagcy() {
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(100);

        PaymentStrategy payPalPayment = new PayPalPayment();
        payPalPayment.checkValid();
        payPalPayment.pay(200);
        payPalPayment.sendResult();
    }

    private static void lambda() {
        PaymentHandler.creditCardPayment.pay(100);

        PaymentHandler.payPalPayment.checkValid();
        PaymentHandler.payPalPayment.pay(200);
        PaymentHandler.payPalPayment.sendResult();
    }

    /**
     * 타입 추론 오류 예제
     */
    private static void typeInferenceErrorExample() {
        Arrays.asList("a", "b", "c").stream()
            .map(x -> {
                if (x.equals("a")) return 1;
                else return "other";
            })
            .forEach(s -> {
                String str = (String) s;
                System.out.println(str);
            });
    }
}
