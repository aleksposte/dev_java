package module_1_5_tasks.lessons.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("sprint is active.");
        activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("sprint is not active.");
        activeSprint = false;
    }
}
