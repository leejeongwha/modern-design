package org.example.moderndesign.visitor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class LambdaVisitor {
    static Map<Class<?>, Function<Object, Integer>> totalPricevisitors = new HashMap<>();

    static {
        totalPricevisitors.put(Book.class, b -> ((Book) b).getPrice());
        totalPricevisitors.put(Fruit.class, f -> ((Fruit) f).getPricePerKg() * ((Fruit) f).getWeight());
    }
}
