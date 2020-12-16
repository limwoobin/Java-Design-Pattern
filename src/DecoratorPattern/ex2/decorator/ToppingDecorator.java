package DecoratorPattern.ex2.decorator;

import DecoratorPattern.ex2.Pizza;

public abstract class ToppingDecorator extends Pizza {
    public abstract String getPizzaName();
}
