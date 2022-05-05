# Flyweight Pattern
클래스의 인스턴스 하나만 가지고 여러 개의 `가상 인스턴스`를 제공하고 싶을때 사용하는 패턴  
즉, 인스턴스를 가능한 대로 공유시켜 쓸데없는 new 연산자를 통한 메모리 낭비를 줄이는 방식 

### Flyweight 의 역할
- 공유에 사용할 클래스들의 인터페이스(api)를 선언

### ConcreteFlyweight 의 역할
- Flyweight 의 내용을 정의함, 실제 공유될 객체

### FlyweightFactory 의 역할
- 해당 factory 를 사용해 Flywight의 인스턴스를 생성 또는 공유해주는 역할을 함

### Client
- 해당 패턴의 사용자