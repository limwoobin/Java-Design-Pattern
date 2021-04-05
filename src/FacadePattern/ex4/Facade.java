package FacadePattern.ex4;

public class Facade {
    private final String beverageName;
    private final String movieName;

    public Facade(String beverageName , String movieName) {
        this.beverageName = beverageName;
        this.movieName = movieName;
    }

    public void viewMovie() {
        Beverage beverage = new Beverage(beverageName);
        RemoteControl remoteControl = new RemoteControl();
        Movie movie = new Movie(movieName);

        beverage.prepare();
        remoteControl.turnOn();
        movie.searchMovie();
        movie.paymentMovie();
        movie.playMovie();
        remoteControl.turnOff();
    }
}
