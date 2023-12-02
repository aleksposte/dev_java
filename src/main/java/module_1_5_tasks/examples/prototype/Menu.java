package module_1_5_tasks.examples.prototype;

public class Menu implements Copyable {
    private int price;
    private String PizzaName;
    private String PizzaDescription;

    public Menu(int price, String PizzaName, String PizzaDescription) {
        this.price = price;
        this.PizzaName = PizzaName;
        this.PizzaDescription = PizzaDescription;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPizzaName() {
        return PizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.PizzaName = pizzaName;
    }

    public String getPizzaDescription() {
        return PizzaDescription;
    }

    public void setPizzaDescription(String pizzaDescription) {
        this.PizzaDescription = pizzaDescription;
    }

    @Override
    public Object copy() {
        Menu copy = new Menu(price, PizzaName, PizzaDescription);
        return copy;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "price=" + price +
                ", PizzaName='" + PizzaName + '\'' +
                ", PizzaDescription='" + PizzaDescription + '\'' +
                '}';
    }
}
