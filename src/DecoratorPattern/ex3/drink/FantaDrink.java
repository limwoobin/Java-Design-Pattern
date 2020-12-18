package DecoratorPattern.ex3.drink;

import DecoratorPattern.ex3.Pizza;

public class FantaDrink extends DrinkDecorator {
    private Pizza pizza;

    public FantaDrink(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return pizza.price() + 2200;
    }

    @Override
    public String getOrder() {
        return pizza.getOrder() + " 환타 추가";
    }
}
