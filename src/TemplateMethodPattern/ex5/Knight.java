package TemplateMethodPattern.ex5;

public class Knight extends Warrior {

    @Override
    void prepareWeapon() {
        System.out.println("칼을 챙긴다.");
    }

    @Override
    void attack() {
        System.out.println("칼을 찌른다.");
    }
}
