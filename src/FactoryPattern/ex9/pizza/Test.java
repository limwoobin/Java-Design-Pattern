package FactoryPattern.ex9.pizza;

/*
Pizza - Product

NyCheesePizza - ConcreteProduct
NyPepperoniPizza - ConcreteProduct
ChicagoCheesePizza - ConcreteProduct
ChicagoPepperoniPizza - ConcreteProduct

PizzaStore - Factory

NYStore - ConcreteFactory
ChicagoStore - ConcreteFactory

ConcreteFactory 에서 ConcreteProduct 생성
*/

public class Test {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza cheesePizza = nyStore.orderPizza("cheese");
        Pizza pepperoniPizza = chicagoStore.orderPizza("pepperoni");

    }
}
