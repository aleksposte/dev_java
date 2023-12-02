package module_1_5_tasks.examples.abstractFactory;

import module_1_5_tasks.examples.abstractFactory.standartDelivery.StandartOrderFactory;

public class StandartDeliveryOrder {
    public static void main(String[] args) {
        PrepareOrder prepareOrder = new StandartOrderFactory();
        Pizza pizza = prepareOrder.getPizza();
        Drink drink = prepareOrder.getDrink();
        Fries fries = prepareOrder.getFries();

        System.out.println("Prepare Standart Order......");

        pizza.createCooked();
        drink.drinkIsPouring();
        fries.friesFry();
    }
}
