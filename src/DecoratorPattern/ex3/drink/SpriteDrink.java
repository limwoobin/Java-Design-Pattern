package DecoratorPattern.ex3.drink;

import DecoratorPattern.ex3.Pizza;

public class SpriteDrink extends DrinkDecorator {
    private Pizza pizza;

    public SpriteDrink(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return pizza.price() + 2000;
    }

    @Override
    public String getOrder() {
        return pizza.getOrder() + " 스프라이트 추가";
    }
}
