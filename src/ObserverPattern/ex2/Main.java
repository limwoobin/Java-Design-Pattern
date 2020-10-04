package ObserverPattern.ex2;

import java.awt.dnd.DragGestureEvent;

public class Main {
    public static void main(String[] args) {
        Drogba drogba = new Drogba();
        Crew1 crew1 = new Crew1();
        Crew2 crew2 = new Crew2();
        Crew3 crew3 = new Crew3();

        drogba.subscribe(crew1);
        drogba.subscribe(crew2);
        drogba.subscribe(crew3);

        drogba.eatFood();
        drogba.unsubscribe(crew3);
        drogba.runaway();

        drogba.unsubscribe(crew2);
        drogba.xxx();
    }
}
