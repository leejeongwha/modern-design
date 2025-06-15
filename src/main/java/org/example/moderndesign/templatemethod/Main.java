package org.example.moderndesign.templatemethod;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        leagcy();
        lambda();
    }

    private static void leagcy() {
        Beverage coffee = new Coffee();
        coffee.prepare();

        Beverage tee = new Tee();
        tee.prepare();
    }

    /**
     * 음료 추출 단계는 인자가 필요 없으므로 Runnable로 정의
     * 첨가물 추가 단계는 필요하다면 현재 음료 객체에 접근 가능하도록 Consumer<Beverage>로 정의
     */
    private static void lambda() {
        BeverageLambda coffee = new BeverageLambda(
            () -> System.out.println("커피 우려내는 중..."),
            b -> b.addCondiments(List.of("설탕", "우유"))
        );
        coffee.prepare();

        BeverageLambda tea = new BeverageLambda(
            () -> System.out.println("차를 우려내는 중..."),
            b -> b.addCondiments(List.of("레몬"))
        );
        tea.prepare();
    }
}
