package DecoratorPattern.ex2;

public class PotatoPizza extends Pizza {
    public PotatoPizza() {
        pizzaName = "PotatoPizza";
    }

    @Override
    public int price() {
        return 11000;
    }
}
