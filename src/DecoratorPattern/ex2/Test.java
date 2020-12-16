package DecoratorPattern.ex2;

import DecoratorPattern.ex2.decorator.CheeseTopping;
import DecoratorPattern.ex2.decorator.OliveTopping;
import DecoratorPattern.ex2.decorator.PepperoniTopping;

public class Test {
    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza();
        Pizza potatoPizza = new PotatoPizza();

        System.out.println(cheesePizza.getPizzaName() + " , " + cheesePizza.price() + " price");
        System.out.println(potatoPizza.getPizzaName() + " , " + potatoPizza.price() + " price");

        cheesePizza = new PepperoniTopping(cheesePizza);
        cheesePizza = new OliveTopping(cheesePizza);
        System.out.println(cheesePizza.getPizzaName() + " , " + cheesePizza.price() + " price");

        potatoPizza = new CheeseTopping(potatoPizza);
        potatoPizza = new OliveTopping(potatoPizza);
        System.out.println(potatoPizza.getPizzaName() + " , " + potatoPizza.price() + " price");
    }
}
