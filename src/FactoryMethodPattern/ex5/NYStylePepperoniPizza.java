package FactoryMethodPattern.ex5;

public class NYStylePepperoniPizza implements Pizza {
    public NYStylePepperoniPizza() {
        System.out.println("NY Pepperoni Pizza create!");
    }

    @Override
    public void prepare() {

    }

    @Override
    public void bake() {

    }

    @Override
    public void box() {

    }
}
