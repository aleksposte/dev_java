package module_1_5_tasks.examples.facade;

public class Cook {
    public void receiveOrder(OrderForCooking orderForCooking) {
        if (orderForCooking.isActiveOrder()) {
            System.out.println("Cook cooking pizza...");
        } else System.out.println("Cook watch TV...");
    }
}
