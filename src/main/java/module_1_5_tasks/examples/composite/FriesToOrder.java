package module_1_5_tasks.examples.composite;

public class FriesToOrder implements ItemToOrder {
    @Override
    public void addItem() {
        System.out.println("Fries add to order");
    }
}
