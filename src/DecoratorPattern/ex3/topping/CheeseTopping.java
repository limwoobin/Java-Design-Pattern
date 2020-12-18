package DecoratorPattern.ex3.topping;

import DecoratorPattern.ex3.Pizza;

public class CheeseTopping extends ToppingDecorator {
    private Pizza pizza;

    public CheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return pizza.price() + 1000;
    }

    @Override
    public String getOrder() {
        return pizza.getOrder() + " 치즈 토핑 추가 ";
    }
}
