package BridgePattern.ex2;

public class OnlyLower extends Exercise {

    public OnlyLower(LowerBodyMethod lowerBodyMethod) {
        super(lowerBodyMethod);
    }

    @Override
    public void start() {
        System.out.println("하체운동 시작");
    }
}
