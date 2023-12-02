package module_1_5_tasks.examples.abstractFactory.premiumDelivery;

import module_1_5_tasks.examples.abstractFactory.Drink;

public class Champagne implements Drink {
    @Override
    public void drinkIsPouring() {
        System.out.println("Champagne is pouring...");
    }
}
