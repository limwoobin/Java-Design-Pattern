import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.toString());

        list.add(1 , 4);
        System.out.println(list.toString());
        list.forEach(System.out::print);
    }
}
