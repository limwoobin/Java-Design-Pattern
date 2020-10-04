package ObserverPattern.ex2;

import java.util.ArrayList;
import java.util.List;

public class Drogba implements Coach {
    private List<Crew> crews;

    public Drogba() {
        crews = new ArrayList<>();
    }

    public void eatFood() {
        System.out.println("드록바코치 밥먹는다~");
        notifyCrew("밥 먹자");
    }

    public void runaway() {
        System.out.println("드록바코치 추노한다");
        notifyCrew("추노한다");
    }

    public void xxx() {
        System.out.println("드록바코치가 쌍욕을한다.");
        notifyCrew("xxxx");
    }

    @Override
    public void subscribe(Crew crew) {
        crews.add(crew);
    }

    @Override
    public void unsubscribe(Crew crew) {
        crews.remove(crew);
    }

    @Override
    public void notifyCrew(String msg) {
        crews.forEach(crew -> crew.update(msg));
    }
}
