package AdapterPattern.ex4;

public class IPhone implements Lightening {
    
    @Override
    public void connect() {
        System.out.println("라이트닝 젠더에 연결");    
    }
}
