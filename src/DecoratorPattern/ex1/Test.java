package DecoratorPattern.ex1;

public class Test {
    public static void main(String[] args) {
        Beverage beverage = new Americano();
        Beverage beverage2 = new CafeLatte();

        System.out.println(beverage.getOrder());
        System.out.println(beverage2.getOrder());

        beverage2 = new WhippingCream(beverage2);
        System.out.println(beverage2.getOrder());
    }
}
