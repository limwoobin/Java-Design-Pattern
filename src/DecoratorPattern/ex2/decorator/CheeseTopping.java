package DecoratorPattern.ex2.decorator;

import DecoratorPattern.ex2.Pizza;

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
    public String getPizzaName() {
        return pizza.getPizzaName() + " 치즈 토핑 추가 ";
    }
}
