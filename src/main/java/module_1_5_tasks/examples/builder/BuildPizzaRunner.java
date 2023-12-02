package module_1_5_tasks.examples.builder;

public class BuildPizzaRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new ItalianoPizzaBuilder());
        Pizza pizza = director.buildPizza();

        System.out.println(pizza);
    }
}
