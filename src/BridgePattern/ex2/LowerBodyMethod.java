package BridgePattern.ex2;

public class LowerBodyMethod implements ExerciseHandler {

    @Override
    public void warmUp() {
        System.out.println("하체를 달군다");
    }

    @Override
    public void exercise() {
        System.out.println("하체를 조진다");
    }

    @Override
    public void coolDown() {
        System.out.println("하체를 차분히 식혀준다");
    }
}
