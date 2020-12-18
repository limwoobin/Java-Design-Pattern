package DecoratorPattern.ex3.topping;

import DecoratorPattern.ex3.Pizza;

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
    public String getOrder() {
        return pizza.getOrder() + " 올리브 토핑 추가 ";
    }
}
