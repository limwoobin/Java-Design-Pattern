package SingletonPattern.ex3;

/*
    자바에서 쓰이는 대표적인 싱글톤 방식 Lazy Holder
    getInstance 메서드가 호출될때 InnerInstance 를 참조하는 순간
    Class 가 로딩되며 초기화가 진행,
    Class 가 로딩하고 초기화를 진행하는 시점은 Thread-safe를 보장
    (volatile , synchronized) 키워드가 필요 없음
    즉, JVM 에게 객체의 초기화를 떠넘기는 방식.
 */
public class Holder {
    private Holder() {}

    private static class InnerInstance {
        private static final Holder instance = new Holder();
    }

    public static Holder getInstance() {
        return InnerInstance.instance;
    }
}
