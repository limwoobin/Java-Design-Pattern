package DecoratorPattern.ex3.topping;

import DecoratorPattern.ex3.Pizza;

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
    public String getOrder() {
        return pizza.getOrder() + " 페페로니 토핑 추가 ";
    }
}
