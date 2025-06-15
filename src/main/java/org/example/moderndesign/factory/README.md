## 팩토리 패턴 (Factory Pattern)

- 객체 생성 로직을 서브 클래스에 위임 함으로써 객체 생성과 사용 코드가 분리되어 결합도가 낮아지고, 새 제품 추가 시 기존 코드 변경 없이 확장이 가능하여 유연성이 높아진다.
- 단점으로는 팩토리 클래스가 과다 생성될 수 있으며, 간단한 객체 생성에 과도한 복잡성을 초래할 수 있다.

### 명시적 클래스 방식과 람다 방식 비교

- Supplier :
    - 입력 파라미터가 없고 값만 반환하는 함수형 인터페이스.
    - 호출될 때마다 새로운 값이나 객체를 “공급(supply)”하는 역할을 한다.
    - 객체 생성, 랜덤값 반환, 복잡한 계산 결과 반환, 지연 평가(lazy evaluation) 등 다양한 상황에서 활용된다.

<pre>
@FunctionalInterface
public interface Supplier {
T get();
}
</pre>

- Lazy Evaluation(지연 평가)와 Supplier :
    - Supplier는 지연 평가(lazy evaluation)에 매우 적합하다.
    - 예를 들어, 비용이 많이 드는 연산이나 객체 생성을 실제로 필요할 때까지 미루고 싶을 때 Supplier를 사용하면,
      get()이 호출되는 시점에만 연산이 수행된다.
