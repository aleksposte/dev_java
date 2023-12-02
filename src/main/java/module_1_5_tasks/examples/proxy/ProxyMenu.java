package module_1_5_tasks.examples.proxy;

public class ProxyMenu implements Menu {
    private String url;
    private PizzaMenu realProject;

    public ProxyMenu(String url) {
        this.url = url;
    }

    @Override
    public void showMenu() {
         if (realProject == null) {
             realProject = new PizzaMenu(url);
         }
         realProject.showMenu();
    }
}
