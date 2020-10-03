package StrategyPattern.ex4;

public class Game {
    public static void main(String[] args) {
        Character drogba = new Character();
        drogba.attack();

        drogba.setWeapon(new Sword());
        drogba.attack();

        drogba.setWeapon(new Knife());
        drogba.attack();

        drogba.setWeapon(new Ax());
        drogba.attack();

        drogba.setWeapon(new Wand());
        drogba.attack();
    }
}
