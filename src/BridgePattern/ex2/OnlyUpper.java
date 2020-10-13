package BridgePattern.ex2;

public class OnlyUpper extends Exercise {

    public OnlyUpper(UpperBodyMethod upperBodyMethod) {
        super(upperBodyMethod);
    }

    @Override
    public void start() {
        System.out.println("상체운동 시작");
    }
}
