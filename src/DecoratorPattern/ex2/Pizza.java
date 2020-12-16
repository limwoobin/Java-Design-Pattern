package DecoratorPattern.ex2;

public abstract class Pizza {
    protected String pizzaName = "Basic Pizza";

    public String getPizzaName() {
        return pizzaName;
    }

    public abstract int price();

}
