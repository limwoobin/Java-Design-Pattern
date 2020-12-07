public class Test {

    void localMethod() {
        class LocalClass {
            int a = 5;
//            a = 15;       지역 클래스에서는 인스턴스 변수가 final

            void innerMethod() {
                System.out.println(a);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.innerMethod();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.localMethod();
    }
}
