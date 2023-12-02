package module_1_5_tasks.examples.abstractFactory.premiumDelivery;

import module_1_5_tasks.examples.abstractFactory.Drink;
import module_1_5_tasks.examples.abstractFactory.Fries;
import module_1_5_tasks.examples.abstractFactory.Pizza;
import module_1_5_tasks.examples.abstractFactory.PrepareOrder;

public class PremiumOrderFactory implements PrepareOrder {

    @Override
    public Pizza getPizza() {
        return new PizzaWithMeat();
    }

    @Override
    public Drink getDrink() {
        return new Champagne();
    }

    @Override
    public Fries getFries() {
        return new LargeFries();
    }
}
