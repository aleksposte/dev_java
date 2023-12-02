package module_1_5_tasks.examples.abstractFactory.standartDelivery;

import module_1_5_tasks.examples.abstractFactory.Drink;
import module_1_5_tasks.examples.abstractFactory.Fries;
import module_1_5_tasks.examples.abstractFactory.Pizza;
import module_1_5_tasks.examples.abstractFactory.PrepareOrder;



public class StandartOrderFactory implements PrepareOrder {
    @Override
    public Pizza getPizza() {
        return new PizzaWithHerbs();
    }

    @Override
    public Drink getDrink() {
        return new Juice();
    }

    @Override
    public Fries getFries() {
        return new NormalFries();
    }
}
