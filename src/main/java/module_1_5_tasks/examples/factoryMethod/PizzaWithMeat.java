package module_1_5_tasks.examples.factoryMethod;

public class PizzaWithMeat implements Pizza {
    @Override
    public void cookedInTheOven() {
        System.out.println("pizza with meat - cooked in the oven...");
    }
}
