package module_1_5_tasks.examples.abstractFactory;

import module_1_5_tasks.examples.abstractFactory.premiumDelivery.PremiumOrderFactory;

public class PremiumDeliveryOrder {
    public static void main(String[] args) {
        PrepareOrder prepareOrder = new PremiumOrderFactory();
        Pizza pizza = prepareOrder.getPizza();
        Drink drink = prepareOrder.getDrink();
        Fries fries = prepareOrder.getFries();

        System.out.println("Prepare Premium Order... ");

        pizza.createCooked();
        drink.drinkIsPouring();
        fries.friesFry();
    }
}
