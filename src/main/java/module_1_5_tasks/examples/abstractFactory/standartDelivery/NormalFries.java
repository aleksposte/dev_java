package module_1_5_tasks.examples.abstractFactory.standartDelivery;

import module_1_5_tasks.examples.abstractFactory.Fries;

public class NormalFries implements Fries {
    @Override
    public void friesFry() {
        System.out.println("Normal Fries is cooked...");
    }
}
