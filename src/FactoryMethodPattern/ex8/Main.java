package FactoryMethodPattern.ex8;

public class Main {
    public static void main(String[] args) {
        IceCreamFactory factory = new IceCreamFactory();

        IceCream chocoIceCream = factory.makeIceCream(Taste.CHOCO);
        IceCream vanillaIceCream = factory.makeIceCream(Taste.VANILLA);
        IceCream mintIceCream = factory.makeIceCream(Taste.MINT);
        IceCream softIceCream = factory.makeIceCream(Taste.BASIC);

        chocoIceCream.taste();
        vanillaIceCream.taste();
        mintIceCream.taste();
        softIceCream.taste();
    }
}
