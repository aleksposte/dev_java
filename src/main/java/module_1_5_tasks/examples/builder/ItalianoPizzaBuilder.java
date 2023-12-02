package module_1_5_tasks.examples.builder;

public class ItalianoPizzaBuilder extends PizzaBuilder {
    @Override
    void buildDough() {
        pizza.setDough(Dough.THIN);
    }

    @Override
    void buildFilling() {
        pizza.setFilling(Filling.MUSHROOMS);
    }

    @Override
    void buildSauce() { pizza.setSauce("italian sauce"); }
}
