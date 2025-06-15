package org.example.moderndesign.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements ItemElement {
    private int price;
    private String isbn;

    @Override
    public int apply(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
