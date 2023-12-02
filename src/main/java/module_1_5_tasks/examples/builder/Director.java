package module_1_5_tasks.examples.builder;

public class Director {
    PizzaBuilder builder;

    public void setBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }

    Pizza buildPizza() {
        builder.createPizza();
        builder.buildDough();
        builder.buildFilling();
        builder.buildSauce();

        Pizza pizza = builder.getPizza();

        return pizza;
    }
}
