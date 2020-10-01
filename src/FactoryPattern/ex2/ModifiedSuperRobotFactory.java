package FactoryPattern.ex2;

public class ModifiedSuperRobotFactory implements RobotFactory {

    @Override
    public Robot createRobot(String name) {
        try {
            Class<?> cls = Class.forName(name);
            Object obj = cls.newInstance();
            return (Robot) obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
