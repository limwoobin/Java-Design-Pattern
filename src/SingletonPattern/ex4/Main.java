package SingletonPattern.ex4;

public class Main {
    public static void main(String[] args) {
        Normal normal = new Normal();
        Normal normal2 = new Normal();

        System.out.println("-----------------------------------");

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
    }
}
