package module_1_5_tasks.examples.flyweight;

public class PizzaToOrder implements ItemToOrder {
    @Override
    public void addItem() {
        System.out.println("Pizza add to order...");
    }
}
