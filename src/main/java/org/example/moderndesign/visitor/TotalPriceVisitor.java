package org.example.moderndesign.visitor;

public class TotalPriceVisitor implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        System.out.println("책 가격: " + book.getPrice());
        return book.getPrice();
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(fruit.getName() + " 가격: " + cost);
        return cost;
    }
}
