package org.example.moderndesign.decorator;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        leagcy();
        lamda();
    }

    private static void leagcy() {
        Text text = new PlainText();
        Text upper = new AllCapsDecorator(text);
        Text upperWithSuffix = new SuffixDecorator(upper, "!!!");
        System.out.println(upperWithSuffix.format("hello world")); // HELLO WORLD!!!
    }

    private static void lamda() {
        // 기본 함수
        Function<String, String> text = s -> s;

        // 데코레이터 함수(대문자 변환)
        Function<String, String> allCaps = s -> s.toUpperCase();

        // 데코레이터 함수(접미사 추가)
        Function<String, String> suffix = s -> s + "!!!";

        // 함수 합성: base → allCaps → addSuffix
        Function<String, String> decorated =
            text.andThen(allCaps).andThen(suffix);

        System.out.println(decorated.apply("hello world")); // HELLO WORLD!!!
    }
}
