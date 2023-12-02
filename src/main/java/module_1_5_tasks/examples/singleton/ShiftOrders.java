package module_1_5_tasks.examples.singleton;

public class ShiftOrders {
    private static ShiftOrders shiftOrders;
    private static String orderList = "Day shift orders: \n";

    public static synchronized ShiftOrders getShiftOrders() {
        if (shiftOrders == null) {
            shiftOrders = new ShiftOrders();
        }
        return shiftOrders;
    }

    private ShiftOrders() {}

    public void addOrder(String newOrder) {
        orderList += newOrder + "\n";
    }

    public void showOrders() {
        System.out.println(orderList);
    }
}
