package 객체지향생활체조_9원칙.No1;

public class As_Is {
    String testNewLine() {
        StringBuilder stringBuilder = new StringBuilder();
        int raw = 10;
        int loop = 5;
        for (int i=0; i < raw; i++) {
            for (int j=0; j < loop; j++) {
                stringBuilder.append("Drogba");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
