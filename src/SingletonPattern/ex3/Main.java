package SingletonPattern.ex3;

public class Main {
    public static void main(String[] args) {
        Holder holder = Holder.getInstance();
        System.out.println(holder.toString());
        System.out.println(holder.hashCode());
    }
}
