package module_1_5_tasks.lessons.abstractFactory;

import module_1_5_tasks.lessons.factoryMethod.Developer;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
