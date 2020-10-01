package FactoryPattern.ex2;

public class SuperRobotFactory implements RobotFactory {

    @Override
    public Robot createRobot(String name) {
        switch (name) {
            case "super" : return new SuperRobot();
            case "power" : return new PowerRobot();
        }
        return null;
    }
}
