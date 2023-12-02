package module_1_5_tasks.examples.factoryMethod;

public class PizzaWithHerbsFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PizzaWithHerbs();
    }
}
