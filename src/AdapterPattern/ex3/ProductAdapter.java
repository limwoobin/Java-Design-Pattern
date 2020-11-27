package AdapterPattern.ex3;

public class ProductAdapter implements V220 {
    private final V110 v110;

    public ProductAdapter(V110 v110) {
        this.v110 = v110;
    }

    @Override
    public void connect() {
        v110.connect();
    }
}
