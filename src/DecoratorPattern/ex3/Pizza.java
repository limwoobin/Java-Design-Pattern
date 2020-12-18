package DecoratorPattern.ex3;

public abstract class Pizza {
    protected String pizzaName = "Basic Pizza";

    public String getOrder() {
        return pizzaName;
    }

    public abstract int price();

}
