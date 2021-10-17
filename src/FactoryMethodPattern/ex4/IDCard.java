package FactoryMethodPattern.ex4;

public class IDCard extends Product {
    private String owner;

    public IDCard(String owner) {
        System.out.println(owner + "의 카드 생성");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this.owner + "의 카드 사용");
    }

    public String getOwner() {
        return this.owner;
    }
}
