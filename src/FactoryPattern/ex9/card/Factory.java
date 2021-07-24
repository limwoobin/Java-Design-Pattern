package FactoryPattern.ex9.card;

public abstract class Factory {
    public final Product create(String owner) {
        return createProduct(owner);
    }

    protected abstract Product createProduct(String owner);
}
