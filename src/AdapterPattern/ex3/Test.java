package AdapterPattern.ex3;

public class Test {
    public static void main(String[] args) {
        V220 samsung = new KoreaProduct();
        V110 sony = new JapanProduct();

        samsung.connect();
        sony.connect();

        samsung = new ProductAdapter(sony);
        samsung.connect();
    }
}
