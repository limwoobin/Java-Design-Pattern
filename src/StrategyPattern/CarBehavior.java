package StrategyPattern;

public class CarBehavior {
}

class Up implements CarMoveBehavior {
    @Override
    public void action() {
        System.out.println("Up");
    }
}

class Down implements CarMoveBehavior {
    @Override
    public void action() {
        System.out.println("Down");
    }
}

class Left implements CarMoveBehavior {
    @Override
    public void action() {
        System.out.println("Left");
    }
}

class Right implements CarMoveBehavior {
    @Override
    public void action() {
        System.out.println("Right");
    }
}