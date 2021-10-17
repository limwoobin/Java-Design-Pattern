package FactoryMethodPattern.ex5;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("pepperoni");
        nyPizzaStore.orderPizza("cheese");
    }
}
