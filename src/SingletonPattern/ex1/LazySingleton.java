package SingletonPattern.ex1;

public class LazySingleton {
    private static LazySingleton uniqueInstance;

    private LazySingleton() {

    }

    public static synchronized LazySingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
        }
        return uniqueInstance;
    }
}

/*
synchronized 키워드를 이용한 게으른 초기화 방식
컴파일 시점에 인스턴스를 생성하는 것이아니라, 인스턴스가 필요한 시점에 요청 하여 동적 바인딩(dynamic binding)(런타임시에 성격이 결정됨)을 통해 인스턴스를 생성
synchronized 키워드를 사용하면 EagerSingleton과 비교해 성능이 약 100배 가량 떨어짐
 */