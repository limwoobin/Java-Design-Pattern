package FirstClassCollection.StatusAndBehavior;

import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Drogba on 2021-02-10
 * github : https://github.com/limwoobin
 */
// 값과 로직이 함께 존재
public class PayGroups {
    private List<Pay> pays;

    public PayGroups(List<Pay> pays) {
        this.pays = pays;
    }

    public Long getNaverPaySum() {
        return pays.stream()
                .filter(pay -> PayType.isNaverPay(pay.getPayType()))
                .mapToLong(Pay::getAmount)
                .sum();
    }

    public Long getKakaoPaySum() {
        return pays.stream()
                .filter(pay -> PayType.isKakaoPay(pay.getPayType()))
                .mapToLong(Pay::getAmount)
                .sum();
    }

    private Long getFilteredPays(Predicate<Pay> predicate) {
        return pays.stream()
                .filter(predicate)
                .mapToLong(Pay::getAmount)
                .sum();
    }
}
