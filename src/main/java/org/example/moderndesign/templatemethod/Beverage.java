package org.example.moderndesign.templatemethod;

abstract class Beverage {
    // 템플릿 메서드 (최종 알고리즘)
    public final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // 공통 단계
    void boilWater() {
        System.out.println("물 끓이는 중...");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중...");
    }

    // 서브클래스에서 구현할 단계
    abstract void brew();

    abstract void addCondiments();
}
