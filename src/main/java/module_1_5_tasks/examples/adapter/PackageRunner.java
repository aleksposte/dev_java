package module_1_5_tasks.examples.adapter;

public class PackageRunner {
    public static void main(String[] args) {
        Boxes boxes = new AdapterPizzaToBox();

        boxes.smallBox();
        boxes.middleBox();
        boxes.bigBox();
    }
}
