# Design Patterns in Java

### 목차

- Strategy
    <details>
        <summary>설명</summary>
        동일한 문제를 해결하는 여러 알고리즘(전략)을 각각 별도의 클래스로 캡슐화하고, 실행 중에 이들 전략을 자유롭게 선택·교체
    </details>
    <details>
        <summary>명시적 클래스 -> 람다</summary>
        각 전략(알고리즘)을 람다로 전달해, 별도의 클래스 없이 동적으로 교체 가능. 코드가 매우 간결해짐
    </details>
- Command
    <details>
        <summary>설명</summary>
        요청(명령)을 객체로 캡슐화하여, 요청의 실행, 취소, 저장, 재실행 등을 유연하게 처리
    </details>
    <details>
        <summary>명시적 클래스 -> 람다</summary>
        실행할 동작을 람다로 캡슐화. 명령 큐, 이벤트 핸들러 등에서 객체 대신 람다를 직접 넘김
    </details>
- Observer
    <details>
        <summary>설명</summary>
        한 객체(주체, Subject)의 상태가 변할 때, 그 객체에 의존하는 여러 객체(옵저버, Observer)들에게 자동으로 알림을 보내고, 옵저버들이 그에 따라 동작
    </details>
    <details>
        <summary>명시적 클래스 -> 람다</summary>
        이벤트 발생 시 호출할 콜백을 람다로 등록. 함수형 인터페이스(Consumer 등)와 결합해 실시간 데이터 처리, 리액티브 프로그래밍에서 활용
    </details>
- Decorator
    <details>
        <summary>설명</summary>
        기존 객체를 수정하지 않고도, 객체에 새로운 기능을 동적으로 추가하거나 확장
    </details>
    <details>
        <summary>명시적 클래스 -> 람다</summary>
        기능 확장을 함수 합성(composition) 또는 람다 체인으로 구현. 각 기능을 작은 함수로 쪼개어 조합
    </details>
- Chain of Responsibility
    <details>
        <summary>설명</summary>
        클라이언트의 요청을 여러 개의 처리 객체(Handler)들이 사슬(chain)처럼 연결되어
        각 객체가 요청을 처리할 수 있는지 판단하고, 처리하지 못하면 다음 객체로 요청을 넘김
    </details>
    <details>
        <summary>명시적 클래스 -> 람다</summary>
        처리 체인을 람다의 연속 호출로 구현. 각 단계가 람다로 표현되어 동적 조합이 쉬움
    </details>
- Factory/Abstract Factory
    <details>
        <summary>설명</summary>
        객체 생성 로직을 별도의 클래스(Factory)에 위임하여, 클라이언트 코드가 직접 객체를 생성(new)하지 않고,필요한 객체를 팩토리에게 요청
    </details>
    <details>
        <summary>명시적 클래스 -> 람다</summary>
        객체 생성 로직을 람다로 전달, 팩토리 메서드를 함수형 인터페이스로 대체 가능
    </details>
- Template Method
    <details>
        <summary>설명</summary>
        알고리즘의 전체 구조(골격)는 상위 클래스(추상 클래스)에서 정의하고, 알고리즘의 세부 단계(일부 구현)는 하위 클래스에서 오버라이드
    </details>
    <details>
        <summary>명시적 클래스 -> 람다</summary>
        추상 메서드 대신 람다를 인자로 받아, 동작의 일부를 외부에서 주입하는 방식으로 구현
    </details>
- Adapter
    <details>
        <summary>설명</summary>
        서로 호환되지 않는 인터페이스를 가진 클래스들이 함께 동작할 수 있도록 중간에 변환기(어댑터)를 둠
    </details>
    <details>
        <summary>명시적 클래스 -> 람다</summary>
        함수 시그니처 변환을 람다로 처리. 단일 메서드 인터페이스라면 람다로 쉽게 대체
    </details>
- Visitor
    <details>
        <summary>설명</summary>
        객체 구조(데이터 구조)와 그 구조에서 수행되는 연산(알고리즘)을 분리.
        즉, 데이터 구조(객체들)를 변경하지 않고도, 새로운 연산(기능)을 추가
    </details>
    <details>
        <summary>명시적 클래스 -> 람다</summary>
        forEach, map, filter 등 스트림 API에서 람다 활용. 반복, 방문 로직을 함수로 전달
    </details>
