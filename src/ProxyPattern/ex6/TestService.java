package ProxyPattern.ex6;

public class TestService implements Service {
    @Override
    public void execute(int number) {
        System.out.println(number + " execute !!");
    }
}
