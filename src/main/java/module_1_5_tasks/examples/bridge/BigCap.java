package module_1_5_tasks.examples.bridge;

public class BigCap extends Cap {
    public BigCap(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void orderPreparation() {
        System.out.println("Large cup selected...");
        coffee.coffeeIsBrewing();
    }
}
