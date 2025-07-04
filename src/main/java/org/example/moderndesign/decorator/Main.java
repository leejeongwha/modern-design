package org.example.moderndesign.decorator;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        leagcy();
        lambda();
    }

    private static void leagcy() {
        // 기본 함수
        Text text = new PlainText();

        // 데코레이터 (대문자 변환)
        Text upper = new AllCapsDecorator(text);

        // 데코레이터 (접미사 추가)
        Text upperWithSuffix = new SuffixDecorator(upper, "!!!");

        // 데코레이터 : base → allCaps → addSuffix
        System.out.println(upperWithSuffix.format("hello world")); // HELLO WORLD!!!
    }

    private static void lambda() {
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
