package module_1_5_tasks.lessons.abstractFactory.website;

import module_1_5_tasks.lessons.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester testing website...");
    }
}
