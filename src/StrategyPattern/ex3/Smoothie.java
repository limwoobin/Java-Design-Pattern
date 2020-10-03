package StrategyPattern.ex3;

public class Smoothie implements BaristarAction {
    @Override
    public void make() {
        System.out.println("스무디 만들기");
    }
}
