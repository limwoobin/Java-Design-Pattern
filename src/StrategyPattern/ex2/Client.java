package StrategyPattern.ex2;

public class Client {
    public static void main(String[] args) {
        Moving train = new Train();
        Moving bus = new Bus();

        /*
            기존 기차와 버스의 이동방식
            1) 기차 - 선로
            2) 버스 - 도로
         */
        train.setMovableStrategy(new RailLoadStrategy());
        bus.setMovableStrategy(new LoadStrategy());

        train.move();
        bus.move();

        /*
            선로를 따라 움직이는 버스 개발
         */
        bus.setMovableStrategy(new RailLoadStrategy());
        bus.move();
    }
}
