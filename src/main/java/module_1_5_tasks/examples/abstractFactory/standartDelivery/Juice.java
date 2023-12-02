package module_1_5_tasks.examples.abstractFactory.standartDelivery;

import module_1_5_tasks.examples.abstractFactory.Drink;

public class Juice implements Drink {
    @Override
    public void drinkIsPouring() {
        System.out.println("Juice is pouring...");
    }
}
