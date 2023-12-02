package module_1_5_tasks.examples.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        OrderFactory orderFactory = new OrderFactory();

        List<ItemToOrder> itemsToOrder = new ArrayList<>();

        itemsToOrder.add(orderFactory.getItemBySpecialty("pizza"));
        itemsToOrder.add(orderFactory.getItemBySpecialty("pizza"));
        itemsToOrder.add(orderFactory.getItemBySpecialty("pizza"));
        itemsToOrder.add(orderFactory.getItemBySpecialty("fries"));

        for (ItemToOrder item: itemsToOrder) {
            item.addItem();
        }
    }
}
