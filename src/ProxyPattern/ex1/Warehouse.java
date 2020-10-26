package ProxyPattern.ex1;

import java.util.concurrent.ConcurrentHashMap;

public class Warehouse implements IOrder {
    private ConcurrentHashMap<Integer , Integer> stock;
    private String address;

    @Override
    public void fulfillOrder(Order order) {
        for (Item item : order.getItemList()) {
            Integer sku = item.getSku();
            this.stock.replace(sku , stock.get(sku) -1);
        }
    }

    public int currentInventory(Item item) {
        return stock.getOrDefault(stock.get(item.getSku()) , 0);
    }
}
