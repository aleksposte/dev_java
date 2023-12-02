package module_1_5_tasks.examples.proxy;

public class PizzaMenu implements Menu {
    private String url;

    public PizzaMenu(String url) {
        this.url = url;
        loadMenu();
    }

    private void loadMenu() {
        System.out.println("loading menu from " + url + " ...");
    }

    @Override
    public void showMenu() {
        System.out.println("show menu " + url + " ...");
    }
}
