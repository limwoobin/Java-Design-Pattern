package FactoryPattern.ex2;

//public abstract class RobotFactory {
//    abstract Robot createRobot(String name);
//}

public interface RobotFactory {
    Robot createRobot(String name);
}