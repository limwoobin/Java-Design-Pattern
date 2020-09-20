package SingletonPattern.ex3;

/*
    synchronized 키워드를 이용해 쓰레드 동시 접근 문제 해결
    but synchronized 키워드는 성능저하를 발생
 */
public class ThreadSafeLazy {
    private static ThreadSafeLazy instance;

    private ThreadSafeLazy() {}

    public static synchronized ThreadSafeLazy getInstance() {
        if (instance == null) {
            return new ThreadSafeLazy();
        }

        return instance;
    }
}
