package SingletonPattern.ex3;

/*
    Static block 방식
    클래스가 로딩될때 한번만 실행 ,
    인스턴스가 사용되는 시점이 아닌 클래스 로딩 시점에 실행됨.
 */
public class StaticBlock {
    private static StaticBlock instance;

    private StaticBlock() {}

    static {
        try {
            instance = new StaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Create instance fail.");
        }
    }

    public static StaticBlock getInstance() {
        return instance;
    }
}

