package DecoratorPattern.ex2;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        pizzaName = "CheesePizza";
    }

    @Override
    public int price() {
        return 10000;
    }
}
