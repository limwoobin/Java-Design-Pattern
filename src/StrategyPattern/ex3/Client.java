package StrategyPattern.ex3;

public class Client {
    public static void main(String[] args) {
        Coffee americano = new Coffee(new Americano());
        Coffee latte = new Coffee(new Latte());
        Coffee smoothie = new Coffee(new Smoothie());

        americano.make();
        latte.make();
        smoothie.make();

        /*
        신메뉴 라떼스무디 등장
         */
        latte = new Coffee(new Smoothie());
        latte.make();
    }
}
