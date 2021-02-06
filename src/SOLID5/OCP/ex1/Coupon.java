package SOLID5.OCP.ex1;

/**
 * Created by Drogba on 2021-02-06
 * github : https://github.com/limwoobin
 */
public class Coupon implements Pay {
    
    @Override
    public void payment(int price) {
        System.out.println(price + " 쿠폰 결제");    
    }
}
