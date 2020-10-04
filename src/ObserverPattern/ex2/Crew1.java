package ObserverPattern.ex2;

public class Crew1 implements Crew {

    @Override
    public void update(String msg) {
        System.out.println("crew1 수신 : " + msg);
    }
}
