package module_1_5_tasks.lessons.abstractFactory.website;

import module_1_5_tasks.lessons.factoryMethod.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer write php code...");
    }
}
