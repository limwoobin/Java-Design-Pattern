package FirstClassCollection.Immutable;

import java.util.List;

/**
 * Created by Drogba on 2021-02-10
 * github : https://github.com/limwoobin
 */

// XXX : 불변 객체 (List Collection 에 접근할 수 있는 방법이 없기 때문에 값의 추가/변경이 안됨)
public class Orders {
    private final List<Order> orders;

    public Orders(List<Order> orders) {
        this.orders = orders;
    }

    public long getAmountSum() {
        return orders.stream()
                .mapToLong(Order::getAmount)
                .sum();
    }
}
