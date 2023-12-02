package module_1_5_tasks.lessons.facade;

public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("developer is solving problems...");
        } else System.out.println("developer is reading Habrahabr...");
    }
}
