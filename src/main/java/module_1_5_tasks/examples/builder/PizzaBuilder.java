package module_1_5_tasks.examples.builder;

public abstract class PizzaBuilder {
    Pizza pizza;

    void createPizza() {
        pizza = new Pizza();
    }

    abstract void buildDough();
    abstract void buildFilling();
    abstract void buildSauce();

    Pizza getPizza() {
        return pizza;
    }
}
