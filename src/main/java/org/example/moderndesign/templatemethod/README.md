## 템플릿 메서드 패턴 (Template Method Pattern)

- 알고리즘 구조 정의: 부모 클래스에서 알고리즘의 뼈대를 정의하고, 특정 단계를 서브클래스에서 구현
- 코드 재사용: 공통 로직은 부모 클래스에, 변하는 부분만 서브클래스에 구현해 중복 코드를 제거
- 확장성: 알고리즘 구조를 변경하지 않고 서브클래스에서 특정 단계를 재정의할 수 있다

### 명시적 클래스 방식과 람다 방식 비교

- 명시적 클래스 방식 :
    - 상속 기반 (강한 결합)
    - 서브클래스 생성 필요
    - 새로운 클래스 생성 필요
- 람다/함수형 방식 :
    - 조합 기반 (유연한 의존성 주입)
    - 람다로 동적 동작 변경 가능
    - 기존 코드 변경 없이 확장
