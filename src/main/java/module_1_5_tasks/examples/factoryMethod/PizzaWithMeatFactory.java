package module_1_5_tasks.examples.factoryMethod;

public class PizzaWithMeatFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaWithMeat();
    }
}
