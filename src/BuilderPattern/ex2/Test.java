package BuilderPattern.ex2;

public class Test {
    public static void main(String[] args) {
        Product product = new Product.Builder()
                .name("food")
                .price(20000)
                .availableStock(5)
                .isFreeDelivery(true)
                .build();

        System.out.println(product.toString());
    }
}
