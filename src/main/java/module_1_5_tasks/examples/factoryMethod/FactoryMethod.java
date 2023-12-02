package module_1_5_tasks.examples.factoryMethod;

public class FactoryMethod {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = createPizzaWithIngredient("herb");
        Pizza pizza = pizzaFactory.createPizza();
        pizza.cookedInTheOven();
    }

    static PizzaFactory createPizzaWithIngredient(String ingredient) {
        if (ingredient.equalsIgnoreCase("herb")) {
            return new PizzaWithHerbsFactory();
        } else if (ingredient.equalsIgnoreCase("meat")) {
            return new PizzaWithMeatFactory();
        } else {
            throw new RuntimeException(ingredient + "is unknown ingredient!");
        }
    }
}
