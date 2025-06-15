package org.example.moderndesign.visitor;

public class Main {
    public static void main(String[] args) {
        leagcy();
        lambda();
    }

    private static void leagcy() {
        ItemElement[] items = {
            new Book(20000, "ISBN-1234"),
            new Fruit(3000, 3, "사과")
        };

        ShoppingCartVisitor visitor = new TotalPriceVisitor();
        int total = 0;
        for (ItemElement item : items) {
            total += item.apply(visitor);
        }
        System.out.println("총 합계: " + total + "원");
    }

    private static void lambda() {
        ItemElement[] items = {
            new Book(20000, "ISBN-5678"),
            new Fruit(3000, 3, "바나나")
        };

        int total = 0;
        for (ItemElement item : items) {
            total += LambdaVisitor.totalPricevisitors.get(item.getClass()).apply(item);
        }
        System.out.println("람다 총 합계: " + total + "원");
    }
}
