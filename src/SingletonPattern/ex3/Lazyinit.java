package SingletonPattern.ex3;

/*
    클래스 로딩 시점이 아닌
    인스턴스가 필요하여 요청할시에 객체 생성.
    but 멀티쓰레드 환경에 취약,
    동시에 getInstance 호출시 인스턴스가 두 번 호출될 가능성 있음.
 */
public class Lazyinit {
    private static Lazyinit instance;

    private Lazyinit() {}

    public static Lazyinit getInstance() {
        if (instance == null) {
            return new Lazyinit();
        }
        return instance;
    }
}
