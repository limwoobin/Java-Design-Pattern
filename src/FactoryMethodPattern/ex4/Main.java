package FactoryMethodPattern.ex4;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("홍길동");
        Product card2 = factory.create("드록바");
        Product card3 = factory.create("말루다");

        card1.use();
        card2.use();
        card3.use();
    }
}
