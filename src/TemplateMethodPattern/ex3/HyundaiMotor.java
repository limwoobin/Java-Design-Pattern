package TemplateMethodPattern.ex3;

import TemplateMethodPattern.ex3.status.Direction;

public class HyundaiMotor extends Motor {

    public HyundaiMotor(Door door) {
        super(door);
    }

    @Override
    void moveMotor(Direction direction) {
        if (direction.equals(Direction.UP)) {
            System.out.println("현대모터 올라갑니다!");
        } else {
            System.out.println("현대모터 내려갑니다!");
        }
    }
}
