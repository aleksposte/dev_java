package module_1_5_tasks.examples.abstractFactory.standartDelivery;

import module_1_5_tasks.examples.abstractFactory.Pizza;
import module_1_5_tasks.lessons.factoryMethod.Developer;

public class PizzaWithHerbs implements Pizza {
    @Override
    public void createCooked() {
        System.out.println("pizza with herb - cooked in the oven...");
    }
}
