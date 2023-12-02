package module_1_5_tasks.examples.abstractFactory.premiumDelivery;

import module_1_5_tasks.examples.abstractFactory.Fries;

public class LargeFries implements Fries {
    @Override
    public void friesFry() {
        System.out.println("Large Fries is cooked...");
    }
}
