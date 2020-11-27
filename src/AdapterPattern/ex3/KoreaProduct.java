package AdapterPattern.ex3;

public class KoreaProduct implements V220 {

    @Override
    public void connect() {
        System.out.println("Connect to 220V");
    }
}
