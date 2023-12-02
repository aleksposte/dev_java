package module_1_5_tasks.lessons.abstractFactory.banking;

import module_1_5_tasks.lessons.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM working...");
    }
}
