package module_1_5_tasks.lessons.abstractFactory.website;

import module_1_5_tasks.lessons.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM working...");
    }
}
