package DecoratorPattern.ex1;

public class WhippingCream extends ToppingDecorator {
    private Beverage beverage;

    public WhippingCream(Beverage beverage) {
        name = "휘핑크림";
        this.beverage = beverage;
    }

    @Override
    public String getOrder() {
        return beverage.getOrder() + " , 토핑:" + name;
    }
}
