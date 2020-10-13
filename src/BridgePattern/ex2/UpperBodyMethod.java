package BridgePattern.ex2;

public class UpperBodyMethod implements ExerciseHandler {

    @Override
    public void warmUp() {
        System.out.println("상체를 달군다");
    }

    @Override
    public void exercise() {
        System.out.println("상체를 조진다");
    }

    @Override
    public void coolDown() {
        System.out.println("상체를 식혀준다");
    }
}
