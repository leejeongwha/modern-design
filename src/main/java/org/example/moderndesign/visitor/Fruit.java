package org.example.moderndesign.visitor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fruit implements ItemElement {
    private int pricePerKg;
    private int weight;
    private String name;

    /**
     * 더블 디스패치(double dispatch)
     * 메서드 호출 시 객체의 타입(자신)과 파라미터의 타입(인자) 두가지 모두에 따라 실행될 메서드가 결정 되는 메커니즘
     * 오버로딩(정적 바인딩)과 오버라이딩(동적 바인딩)을 모두 사용하여 적절하게 더블 디스패치 구현
     * instanceof 없이 타입별 분기 처리 가능
     * 
     */
    @Override
    public int apply(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
