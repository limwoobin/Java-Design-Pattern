package FacadePattern.ex5;

public class Run {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Light light = new Light();
        Radio radio = new Radio();

        // 이전 사용 방식
        System.out.println("=======  집에 나갈때  =======");
        computer.turnOff();
        light.turnOff();
        radio.turnOff();

        // Facade Pattern 적용 후
        System.out.println("=======  집에 들어올때  =======");
        HomeFacade homeFacade = new HomeFacade(computer  , light , radio);
        homeFacade.homeIn();
    }
}
