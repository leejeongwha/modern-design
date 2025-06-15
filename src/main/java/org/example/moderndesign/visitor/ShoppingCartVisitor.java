package org.example.moderndesign.visitor;

public interface ShoppingCartVisitor {
    int visit(Book book);

    int visit(Fruit fruit);
}
