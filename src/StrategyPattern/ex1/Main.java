package StrategyPattern.ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println("==== Java Strategy Pattern ====");

        Car carUp = new Car(new Up());
        carUp.move();

        Car carDown = new Car(new Down());
        carDown.move();

        Car carLeft = new Car(new Left());
        carLeft.move();

        Car carRight = new Car(new Right());
        carRight.move();

        carRight.setMove(new Down());
        carRight.move();
    }
}

/*
각각의 알고리즘군을 교환이 가능하도록 별도로 정의 , 각각 캡슐화 한 후 서로 교환해서 사용.
프로젝트 전체에서 변경이 일어나지 않는 부분에서 변경이 일어나는 부분을 찾아 따로 캡슐화.
 */