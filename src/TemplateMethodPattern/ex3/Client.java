package TemplateMethodPattern.ex3;

import TemplateMethodPattern.ex3.status.Direction;
import TemplateMethodPattern.ex3.status.MotorStatus;

public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
        hyundaiMotor.move(Direction.UP);
        hyundaiMotor.setMotorStatus(MotorStatus.STOPPED);
        hyundaiMotor.move(Direction.DOWN);

        LgMotor lgMotor = new LgMotor(door);
        lgMotor.move(Direction.DOWN);
        lgMotor.setMotorStatus(MotorStatus.STOPPED);
        lgMotor.move(Direction.UP);
    }
}
