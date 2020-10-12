package BridgePattern.ex1;

public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    void rawOpen() {
        printLine();
    }

    @Override
    void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");		           // 테두리의 모서리를 표현하는 "+" 마크를 표시한다.
        for (int i = 0; i < width; i++) {	   // width개의 "-"를 표시해서
            System.out.print("-");			   // 테두리 선으로 이용한다.
        }
        System.out.println("+");	           // 테두리 모서리를 표시하는 "+" 마크를 표시한다.
    }
}
