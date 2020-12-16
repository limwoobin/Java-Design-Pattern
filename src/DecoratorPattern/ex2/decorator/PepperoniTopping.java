package DecoratorPattern.ex2.decorator;

import DecoratorPattern.ex2.Pizza;

public class PepperoniTopping extends ToppingDecorator {
    private Pizza pizza;

    public PepperoniTopping(Pizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public int price() {
        return pizza.price() + 500;
    }

    @Override
    public String getPizzaName() {
        return pizza.getPizzaName() + " 페페로니 토핑 추가 ";
    }
}
