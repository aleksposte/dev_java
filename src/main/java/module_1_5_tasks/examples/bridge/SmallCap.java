package module_1_5_tasks.examples.bridge;

public class SmallCap extends Cap {
    public SmallCap(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void orderPreparation() {
        System.out.println("Small cup selected...");
        coffee.coffeeIsBrewing();
    }
}
