package module_1_5_tasks.examples.flyweight;

public class FriesToOrder implements ItemToOrder {
    @Override
    public void addItem() {
        System.out.println("Fries add to order");
    }
}
