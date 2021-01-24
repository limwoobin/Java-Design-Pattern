package SOLID5.ISP.ex1;

public class PaidDeliveryProduct implements Product , DeliveryPay {
    @Override
    public void deliveryPay() {
        System.out.println("배송비 5000원");
    }

    @Override
    public void order() {
        System.out.println("무료 배송 상품 주문");
    }
}
