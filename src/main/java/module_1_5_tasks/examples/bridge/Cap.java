package module_1_5_tasks.examples.bridge;

public abstract class Cap {
    protected Coffee coffee;

    public Cap(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract void orderPreparation();
}
