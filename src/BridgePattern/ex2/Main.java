package BridgePattern.ex2;

public class Main {
    public static void main(String[] args) {
        Exercise onlyLower = new OnlyLower(new LowerBodyMethod());
        Exercise onlyUpper = new OnlyUpper(new UpperBodyMethod());

        onlyLower.warmUp();
        onlyLower.exercise();
        onlyLower.coolDown();

        System.out.println("------------");

//        onlyUpper.warmUp();
//        onlyUpper.exercise();
//        onlyUpper.coolDown();
        onlyUpper.start();
        onlyUpper.exercise();
        onlyUpper.exercise();
        onlyUpper.exercise();
    }
}
