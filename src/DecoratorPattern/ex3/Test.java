package DecoratorPattern.ex3;

import DecoratorPattern.ex3.drink.ColaDrink;
import DecoratorPattern.ex3.drink.SpriteDrink;
import DecoratorPattern.ex3.topping.CheeseTopping;
import DecoratorPattern.ex3.topping.OliveTopping;
import DecoratorPattern.ex3.topping.PepperoniTopping;

public class Test {
    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza();
        Pizza potatoPizza = new PotatoPizza();

        System.out.println(cheesePizza.getOrder() + " , " + cheesePizza.price() + " price");
        System.out.println(potatoPizza.getOrder() + " , " + potatoPizza.price() + " price");

        cheesePizza = new PepperoniTopping(cheesePizza);
        cheesePizza = new OliveTopping(cheesePizza);
        System.out.println(cheesePizza.getOrder() + " , " + cheesePizza.price() + " price");

        potatoPizza = new CheeseTopping(potatoPizza);
        potatoPizza = new OliveTopping(potatoPizza);
        System.out.println(potatoPizza.getOrder() + " , " + potatoPizza.price() + " price");

        cheesePizza = new SpriteDrink(cheesePizza);
        System.out.println(cheesePizza.getOrder() + " , " + cheesePizza.price() + " price");

        potatoPizza = new ColaDrink(potatoPizza);
        System.out.println(potatoPizza.getOrder() + " , " + potatoPizza.price() + " price");
    }
}
