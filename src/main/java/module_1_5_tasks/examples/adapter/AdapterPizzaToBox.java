package module_1_5_tasks.examples.adapter;

public class AdapterPizzaToBox extends TypesOfPizza implements Boxes {
    @Override
    public void smallBox() {
        quarterPizza();
    }

    @Override
    public void middleBox() {
        halfPizza();
    }

    @Override
    public void bigBox() {
        wholePizza();
    }
}
