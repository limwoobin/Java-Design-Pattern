package AdapterPattern.ex3;

public class JapanProduct implements V110 {

    @Override
    public void connect() {
        System.out.println("Connect to 110V");
    }
}
