package SingletonPattern.ex1;

public class DCLSingleton {
    private volatile static DCLSingleton uniqueInstance;

    private DCLSingleton() {

    }

    public DCLSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DCLSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DCLSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}


/*
Lazy Initialization. Double Checking Locking(DCL, Thread-safe)
인스턴스가 생성되지 않은 경우에만 동기화 블럭이 실행되게끔 구현하는 방식
volatile 키워드가 등장하는데, volatile 키워드를 사용하면 멀티스레딩을 쓰더라도 uniqueInstance 변수가 Sigleton 인스턴스로 초기화 되는 과정이 올바르게 진행되도록 할 수 있음
volatile 변수는 값을 CPU Cache 에서 읽어오는 것이 아닌 Main Memory 에 값을 저장하고 읽어오기 때문에(read and write) 변수 값 불일치 문제가 생기지 않음
 */