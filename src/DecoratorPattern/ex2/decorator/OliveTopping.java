package DecoratorPattern.ex2.decorator;

import DecoratorPattern.ex2.Pizza;

public class OliveTopping extends ToppingDecorator {
    private Pizza pizza;

    public OliveTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return pizza.price() + 300;
    }

    @Override
    public String getPizzaName() {
        return pizza.getPizzaName() + " 올리브 토핑 추가 ";
    }
}
