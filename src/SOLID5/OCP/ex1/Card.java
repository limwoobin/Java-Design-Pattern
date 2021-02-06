package SOLID5.OCP.ex1;

/**
 * Created by Drogba on 2021-02-06
 * github : https://github.com/limwoobin
 */
public class Card implements Pay {
    @Override
    public void payment(int price) {
        System.out.println(price + " 카드 결제");
    }
}
