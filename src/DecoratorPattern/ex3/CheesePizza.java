package DecoratorPattern.ex3;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        pizzaName = "CheesePizza";
    }

    @Override
    public int price() {
        return 10000;
    }
}
