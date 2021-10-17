package FactoryMethodPattern.ex9.card;

public class IDCard implements Product {
    private final String owner;

    public IDCard(String owner) {
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + " use");
    }
}
