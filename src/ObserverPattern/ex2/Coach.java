package ObserverPattern.ex2;

public interface Coach {
    void subscribe(Crew crew);
    void unsubscribe(Crew crew);
    void notifyCrew(String msg);
}
