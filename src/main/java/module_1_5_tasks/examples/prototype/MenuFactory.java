package module_1_5_tasks.examples.prototype;

public class MenuFactory {
    Menu menu;

    public MenuFactory(Menu menu) {
        this.menu = menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    Menu cloneMenu() {
        return (Menu) menu.copy();
    }
}
