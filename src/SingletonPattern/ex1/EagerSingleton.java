package SingletonPattern.ex1;

public class EagerSingleton {
    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return uniqueInstance;
    }
}


/*
(이른 초기화, Thread-safe)
static 키워드의 특징을 이용해서 클래스 로더가 초기화 하는 시점에서 정적 바인딩(static binding)(컴파일 시점에서 성격이 결정됨)을 통해 해당 인스턴스를 메모리에 등록
이른 초기화 방식은 클래스 로더에 의해 클래스가 최초로 로딩 될 때 객체가 생성되기때문에 Thread-safe
 */