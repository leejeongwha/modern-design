package org.example.moderndesign.templatemethod;

public class Coffee extends Beverage {
    void brew() {
        System.out.println("커피를 우려내는 중...");
    }

    void addCondiments() {
        System.out.println("설탕,우유 추가...");
    }
}
