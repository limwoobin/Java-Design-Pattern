package TemplateMethodPattern.ex4;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("물을 끓이다.");
    }

    void pourInCup() {
        System.out.println("컵에 따르다.");
    }

    abstract void brew();
    abstract void addCondiments();


}
