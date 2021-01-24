package SOLID5.ISP.ex1;

public class FreeDeliveryProduct implements Product {

    @Override
    public void order() {
        System.out.println("무료 배송 상품 주문");
    }
}
