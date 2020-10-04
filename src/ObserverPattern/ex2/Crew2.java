package ObserverPattern.ex2;

public class Crew2 implements Crew {

    @Override
    public void update(String msg) {
        System.out.println("Crew2 수신 : " + msg);
    }
}
