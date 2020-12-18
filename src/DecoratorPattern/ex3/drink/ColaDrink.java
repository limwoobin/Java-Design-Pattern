package DecoratorPattern.ex3.drink;

import DecoratorPattern.ex3.Pizza;

public class ColaDrink extends DrinkDecorator {
    private Pizza pizza;

    public ColaDrink(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return pizza.price() + 2500;
    }

    @Override
    public String getOrder() {
        return pizza.getOrder() + " 콜라 추가";
    }
}
