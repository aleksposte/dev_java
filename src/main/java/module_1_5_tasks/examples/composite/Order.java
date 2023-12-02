package module_1_5_tasks.examples.composite;

public class Order {
    public static void main(String[] args) {
        ListOrder listOrder = new ListOrder();

        ItemToOrder firstPizza = new PizzaToOrder();
        ItemToOrder secondPizza = new PizzaToOrder();
        ItemToOrder fries = new FriesToOrder();

        listOrder.addItemToOrder(firstPizza);
        listOrder.addItemToOrder(secondPizza);
        listOrder.addItemToOrder(fries);

        listOrder.createOrder();
    }
}
