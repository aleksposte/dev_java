package module_1_5_tasks.examples.abstractFactory.premiumDelivery;

import module_1_5_tasks.examples.abstractFactory.Pizza;


public class PizzaWithMeat implements Pizza {
    @Override
    public void createCooked() {
        System.out.println("pizza with meat - is cooking");
    }
}
