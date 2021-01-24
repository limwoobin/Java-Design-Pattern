package SOLID5.ISP.ex2;

public class Test {
    public static void main(String[] args) {
        Factory factory = new MyFactory();
        MachineShop factory2 = new MyFactory2();

        factory.createTank();
        factory.createVulture();

        System.out.println("----------------------------------");

        factory2.createVulture();
        factory2.createTank();
        factory2.createGoliath();
    }
}
