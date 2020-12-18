package DecoratorPattern.ex3.topping;

import DecoratorPattern.ex3.Pizza;

public abstract class ToppingDecorator extends Pizza {
    public abstract String getOrder();
}
