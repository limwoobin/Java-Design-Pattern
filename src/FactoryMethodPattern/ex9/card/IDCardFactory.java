package FactoryMethodPattern.ex9.card;

public class IDCardFactory extends Factory {

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
}
