# Design Patterns in Java

## 목차

### Strategy
    각 전략(알고리즘)을 람다로 전달해, 별도의 클래스 없이 동적으로 교체 가능. 코드가 매우 간결해짐
### Command
    실행할 동작을 람다로 캡슐화. 명령 큐, 이벤트 핸들러 등에서 객체 대신 람다를 직접 넘김
### Observer
    이벤트 발생 시 호출할 콜백을 람다로 등록. 함수형 인터페이스(Consumer 등)와 결합해 실시간 데이터 처리, 리액티브 프로그래밍에서 활용
### Decorator
    기능 확장을 함수 합성(composition) 또는 람다 체인으로 구현. 각 기능을 작은 함수로 쪼개어 조합
### Chain of Responsibility
    처리 체인을 람다의 연속 호출로 구현. 각 단계가 람다로 표현되어 동적 조합이 쉬움
### Factory/Abstract Factory
    객체 생성 로직을 람다로 전달, 팩토리 메서드를 함수형 인터페이스로 대체 가능
### Template Method
    추상 메서드 대신 람다를 인자로 받아, 동작의 일부를 외부에서 주입하는 방식으로 구현
### Adapter
    함수 시그니처 변환을 람다로 처리. 단일 메서드 인터페이스라면 람다로 쉽게 대체
### Visitor
    forEach, map, filter 등 스트림 API에서 람다 활용. 반복, 방문 로직을 함수로 전달
