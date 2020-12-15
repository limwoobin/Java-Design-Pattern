package DecoratorPattern.ex1;

public abstract class Beverage {
    String name = "";

    public String getOrder() {
        return name;
    }

    @Override
    public String toString() {
        return name + " 주문";
    }
}
