package SOLID5.OCP.ex1;

/**
 * Created by Drogba on 2021-02-06
 * github : https://github.com/limwoobin
 */
public class Test {
    public static void main(String[] args) {
        notOcpMethod("card");
        ocpMethod("cash");
    }

    private static void notOcpMethod(String payType) {
        // OCP 를 위반한 경우
        if ("card".equals(payType)) {
            new Card().payment(2000);
        } else if ("cash".equals(payType)) {
            new Cash().payment(2000);
        } else if ("coupon".equals(payType)) {
            new Coupon().payment(2000);
        }
        // 새로운 결제 타입이 추가되면 기존 코드를 수정해야함
    }

    private static void ocpMethod(String payType) {
        PayFactory payFactory = new PayFactory();
        Pay pay = payFactory.createPay(payType);
        pay.payment(5000);
        // 새로운 결제 타입이 추가되면 기존 코드를 수정하는 것이 아닌 팩토리 메소드에 추가만 하면 됨
    }
}
