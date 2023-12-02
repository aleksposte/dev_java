package module_1_5_tasks.examples.prototype;

public class MenuCopyRunner {
    public static void main(String[] args) {
        Menu sampleMenu = new Menu(150, "Pepperoni", "Pepperoni is a variety of spicy salami made from cured pork and beef seasoned with paprika and other chili peppers.");

        System.out.println(sampleMenu);

        // v1
        Menu sampleMenuClone = (Menu) sampleMenu.copy();
        System.out.println(sampleMenuClone);

        // v2
        MenuFactory factory = new MenuFactory(sampleMenu);
        Menu sampleMenuCloneV2 = factory.cloneMenu();
        System.out.println(sampleMenuCloneV2);
    }
}
