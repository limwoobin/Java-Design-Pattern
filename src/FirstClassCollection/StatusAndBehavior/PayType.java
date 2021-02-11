package FirstClassCollection.StatusAndBehavior;

/**
 * Created by Drogba on 2021-02-10
 * github : https://github.com/limwoobin
 */
public enum PayType {
    KAKAO,
    NAVER;

    public static boolean isNaverPay(PayType payType) {
        return NAVER.equals(payType);
    }

    public static boolean isKakaoPay(PayType payType) {
        return KAKAO.equals(payType);
    }
}
