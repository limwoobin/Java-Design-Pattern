package AdapterPattern.ex4;

public class GalaxyPhone implements CType {

    @Override
    public void connect() {
        System.out.println("C Type 젠더에 연결");
    }
}
