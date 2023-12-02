package module_1_5_tasks.examples.composite;

import java.util.ArrayList;
import java.util.List;

public class ListOrder {
    private List<ItemToOrder> itemToOrders = new ArrayList<ItemToOrder>();
    public void addItemToOrder(ItemToOrder itemToOrder) {
        itemToOrders.add(itemToOrder);
    }
    public void removeItemToOrder(ItemToOrder itemToOrder) {
        itemToOrders.remove(itemToOrder);
    }

    public void createOrder() {
        System.out.println("Order created...");

        for (ItemToOrder item : itemToOrders) {
            item.addItem();
        }
    }
}
