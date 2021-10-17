package FactoryMethodPattern.ex9.card;

public class Test {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product p = factory.create("t1");
        Product p2 = factory.create("t2");
        Product p3 = factory.create("t3");

        p.use();
        p2.use();
        p3.use();
    }
}
