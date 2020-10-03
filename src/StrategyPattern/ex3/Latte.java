package StrategyPattern.ex3;

public class Latte implements BaristarAction {
    @Override
    public void make() {
        System.out.println("라떼 만들기");
    }
}
