package StrategyPattern.ex3;

public class Coffee {
    private BaristarAction baristarAction;

    public Coffee(BaristarAction baristarAction) {
        this.baristarAction = baristarAction;
    }

    public void setBaristarAction(BaristarAction baristarAction) {
        this.baristarAction = baristarAction;
    }

    public void make() {
        baristarAction.make();
    }
}
