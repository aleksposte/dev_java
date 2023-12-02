package module_1_5_tasks.examples.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println(ShiftOrders.getShiftOrders().toString());
        System.out.println(ShiftOrders.getShiftOrders().toString());
        System.out.println(ShiftOrders.getShiftOrders().toString());

        ShiftOrders.getShiftOrders().addOrder("pizza");
        ShiftOrders.getShiftOrders().addOrder("pizza, juice");
        ShiftOrders.getShiftOrders().addOrder("pizza");
        ShiftOrders.getShiftOrders().addOrder("fries, water");

        ShiftOrders.getShiftOrders().showOrders();
    }
}
