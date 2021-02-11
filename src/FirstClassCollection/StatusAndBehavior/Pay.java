package FirstClassCollection.StatusAndBehavior;

/**
 * Created by Drogba on 2021-02-10
 * github : https://github.com/limwoobin
 */
public class Pay {
    private PayType payType;
    private long amount;

    public Pay(PayType payType , long amount) {
        this.payType = payType;
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }
}
