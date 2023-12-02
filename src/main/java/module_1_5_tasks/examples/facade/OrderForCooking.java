package module_1_5_tasks.examples.facade;

public class OrderForCooking {
    private boolean activeOrder;

    public boolean isActiveOrder() {
        return activeOrder;
    }

    public void startPizzaCooking() {
        System.out.println("order is active.");
        activeOrder = true;
    }

    public void finishPizzaCooking() {
        System.out.println("order is not active.");
        activeOrder = false;
    }
}
