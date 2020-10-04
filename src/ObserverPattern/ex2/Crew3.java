package ObserverPattern.ex2;

public class Crew3 implements Crew {
    @Override
    public void update(String msg) {
        System.out.println("Crew3 수신 :" + msg);
    }
}
