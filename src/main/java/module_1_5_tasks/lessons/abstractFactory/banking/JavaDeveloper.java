package module_1_5_tasks.lessons.abstractFactory.banking;

import module_1_5_tasks.lessons.factoryMethod.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write java code...");
    }
}
