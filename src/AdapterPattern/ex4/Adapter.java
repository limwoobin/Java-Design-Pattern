package AdapterPattern.ex4;

public class Adapter implements Lightening {
    private CType cType;

    public Adapter(CType cType) {
        this.cType = cType;
    }

    @Override
    public void connect() {
        cType.connect();
    }
}
