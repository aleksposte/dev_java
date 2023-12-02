package module_1_5_tasks.examples.proxy;

public class GetMenuRunner {
    public static void main(String[] args) {
        Menu menu = new ProxyMenu("https://www.pizzasite/getmenu");

        menu.showMenu();
    }
}
