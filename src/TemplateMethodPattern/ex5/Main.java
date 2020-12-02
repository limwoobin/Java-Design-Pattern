package TemplateMethodPattern.ex5;

public class Main {
    public static void main(String[] args) {
        Warrior knight = new Knight();
        Warrior archer = new Archer();
        Warrior wizard = new Wizard();

        knight.prepareWar();
        System.out.println("------------------------------");
        archer.prepareWar();
        System.out.println("------------------------------");
        wizard.prepareWar();
    }
}
