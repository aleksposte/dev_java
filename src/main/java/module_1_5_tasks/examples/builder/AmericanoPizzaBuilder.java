package module_1_5_tasks.examples.builder;

public class AmericanoPizzaBuilder extends PizzaBuilder {
    @Override
    void buildDough() {
        pizza.setDough(Dough.THICK);
    }

    @Override
    void buildFilling() { pizza.setFilling(Filling.MEAT); }

    @Override
    void buildSauce() { pizza.setSauce("americano sauce"); }
}
