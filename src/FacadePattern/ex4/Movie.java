package FacadePattern.ex4;

public class Movie {
    private final String name;

    public Movie(String name) {
        this.name = name;
    }

    public void searchMovie() {
        System.out.println(name + " 영화 검색");
    }

    public void paymentMovie() {
        System.out.println("영화 결제");
    }

    public void playMovie() {
        System.out.println("영화 재생");
    }
}
