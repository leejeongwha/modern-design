package org.example.moderndesign.templatemethod;

import java.util.List;
import java.util.function.Consumer;

public class BeverageLambda {
    private final Runnable brewStep;
    private final Consumer<BeverageLambda> condimentStep;

    BeverageLambda(Runnable brew, Consumer<BeverageLambda> condiment) {
        this.brewStep = brew;
        this.condimentStep = condiment;
    }

    public final void prepare() {
        boilWater();
        brewStep.run();
        pourInCup();
        condimentStep.accept(this);
    }

    private void boilWater() {
        System.out.println("물 끓이는 중...");
    }

    private void pourInCup() {
        System.out.println("컵에 따르는 중...");
    }

    public void addCondiments(List<String> condiments) {
        System.out.println(String.join(",", condiments) + " 추가...");
    }
}
