package org.example.moderndesign.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fruit implements ItemElement {
    private int pricePerKg;
    private int weight;
    private String name;

    @Override
    public int apply(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
