package TemplateMethodPattern.ex5;

public class Wizard extends Warrior {

    @Override
    void prepareWeapon() {
        System.out.println("지팡이를 챙긴다.");
    }

    @Override
    void attack() {
        System.out.println("마법을 쓴다.");
    }
}
