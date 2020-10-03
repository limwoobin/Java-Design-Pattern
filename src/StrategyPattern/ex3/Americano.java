package StrategyPattern.ex3;

public class Americano implements BaristarAction {
    @Override
    public void make() {
        System.out.println("아메리카노 만들기");
    }
}
