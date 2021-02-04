import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        System.out.println(set.toString());

        set.remove("C");
        System.out.println(set.toString());

        set.forEach(System.out::println);
    }
}
