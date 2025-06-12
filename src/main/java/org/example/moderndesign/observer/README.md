## Observer 패턴

- 한 객체(Subject)의 상태 변화가 있을 때 그와 의존 관계에 있는 여러 객체(Observer)에게 자동으로 통지해주는 방식을 의미
- 느슨한 결합으로 인하여 객체 간의 의존성을 줄이고, 객체 간의 상호작용을 유연하게 만들어줌

### 핵심 개념

- Subject(주제) : 상태를 가지고 있으며, Observer를 등록하고 상태 변화 시 알림을 보내는 객체
- Observer(관찰자) : Subject의 상태 변화를 감지해서 자신을 갱신하는 객체

### 대표적인 예시

- Spring Framework (ApplicationEvent & Listener)
    - ApplicationEvent와 ApplicationListener를 통해 애플리케이션 이벤트 발생 시 여러 리스너에 통지
- 메시지 큐
    - RabbitMQ, Kafka 등에서 메시지를 발행하고 구독하는 구조
    - 발행-구독(Pub-Sub) 모델: 메시지 생산자(Producer, 주제 역할)가 메시지를 보내면, 소비자(Consumer, 옵저버 역할)가 구독 후 메시지를 받음

### Observer 패턴과 메시지 큐와의 관계

- 대상 범위 :
    - **Observer 패턴**: 같은 프로세스 내 객체 간 알림
    - **메시지 큐**: 네트워크를 통한 분산 메시지 전달
- 관리 주체 :
    - **Observer 패턴**: Subject(주제) 객체가 옵저버 직접 관리
    - **메시지 큐**: 브로커(중간 서버)가 메시지 관리
- 메시지 저장 :
    - **Observer 패턴**: 없음(상태 변화 시점에만 알림)
    - **메시지 큐**: 메시지를 큐에 저장하고 소비자가 나중에 처리 가능
- 통신 방식 :
    - **Observer 패턴**: 동기 혹은 비동기
    - **메시지 큐**: 비동기
- 패턴 분류 :
    - **Observer 패턴**: 옵저버 패턴 (Observer Pattern)
    - **메시지 큐**: 엄밀하게 말하면 발행-구독 패턴 (Publish-Subscribe Pattern)
