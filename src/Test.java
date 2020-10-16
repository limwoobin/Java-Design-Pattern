abstract class Parent {
    private void test() {
        System.out.println("Test");
    }

    public void test2() {
        System.out.println("public Test");
    }
}

public class Test extends Parent {

    @Override
    public void test2() {
        super.test2();
    }

    public static void main(String[] args) {

    }
}
