package BuilderPattern.ex2;

public class Product {
    private final String name;
    private final int price;
    private final int availableStock;
    private final boolean isFreeDelivery;

    public static class Builder {
        private String name;
        private int price;
        private int availableStock;
        private boolean isFreeDelivery;

        public Builder() {

        }

        public Builder(String name , int price , int availableStock , boolean isFreeDelivery) {
            this.name = name;
            this.price = price;
            this.availableStock = availableStock;
            this.isFreeDelivery = isFreeDelivery;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Builder availableStock(int availableStock) {
            this.availableStock = availableStock;
            return this;
        }

        public Builder isFreeDelivery(boolean isFreeDelivery) {
            this.isFreeDelivery = isFreeDelivery;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", availableStock=" + availableStock +
                    ", isFreeDelivery=" + isFreeDelivery +
                    '}';
        }
    }

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.availableStock = builder.availableStock;
        this.isFreeDelivery = builder.isFreeDelivery;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", availableStock=" + availableStock +
                ", isFreeDelivery=" + isFreeDelivery +
                '}';
    }
}
