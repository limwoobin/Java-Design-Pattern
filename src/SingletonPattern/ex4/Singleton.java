package SingletonPattern.ex4;

public class Singleton {

    private Singleton() {
        System.out.println("Created Singleton Instance");
    }

    private static class LazyHolder {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        System.out.println("called");
        return LazyHolder.instance;
    }
}
