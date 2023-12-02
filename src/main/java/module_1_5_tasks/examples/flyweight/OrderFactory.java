package module_1_5_tasks.examples.flyweight;

import java.util.HashMap;
import java.util.Map;

public class OrderFactory {
    private static final Map<String, ItemToOrder> itemToOrders = new HashMap<>();

    public ItemToOrder getItemBySpecialty(String specialty) {
        ItemToOrder itemToOrder = itemToOrders.get(specialty);

        if (itemToOrder == null) {
            switch (specialty) {
                case "pizza" -> {
                    System.out.println("cooked item pizza...");
                    itemToOrder = new PizzaToOrder();
                }
                case "fries" -> {
                    System.out.println("cooked item fries...");
                    itemToOrder = new FriesToOrder();
                }
            }
            itemToOrders.put(specialty, itemToOrder);
        }
        return itemToOrder;
    }
}
