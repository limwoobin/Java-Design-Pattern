package 객체지향생활체조_9원칙.No1;

public class To_Be {
    String testNewLine() {
        StringBuilder stringBuilder = new StringBuilder();
        int raw = 10;
        int loop = 5;
        loopTestNewLine(stringBuilder , raw , loop);

        return stringBuilder.toString();
    }

    private void loopTestNewLine(StringBuilder stringBuilder , int raw , int loop) {
        for (int i=0; i < raw; i++) {
            loopTestNewSubLine(stringBuilder, loop);
            stringBuilder.append("\n");
        }
    }

    private void loopTestNewSubLine(StringBuilder stringBuilder , int loop) {
        for (int i=0; i < loop; i++) {
            stringBuilder.append("Drogba");
        }
    }
}
