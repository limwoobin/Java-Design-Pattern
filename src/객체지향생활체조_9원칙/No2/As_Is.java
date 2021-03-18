package 객체지향생활체조_9원칙.No2;

public class As_Is {
    // 시나리오 -  boolean 이 true 이면 return , false 이면 int 값이 두자리수이면 true 아니면 false
    boolean elseTest(boolean status , int number) {
        if (status) {
            return true;
        } else {
            if (String.valueOf(number).length() == 2) {
                return true;
            } else {
                return false;
            }
        }
    }
}
