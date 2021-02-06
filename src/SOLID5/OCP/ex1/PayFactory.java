package SOLID5.OCP.ex1;

/**
 * Created by Drogba on 2021-02-06
 * github : https://github.com/limwoobin
 */
public class PayFactory {
    public Pay createPay(String payType) {
        switch (payType) {
            case "card" : return new Card();
            case "cash" : return new Cash();
            case "coupon" : return new Coupon();
            default: return null;
        }
    }
}
