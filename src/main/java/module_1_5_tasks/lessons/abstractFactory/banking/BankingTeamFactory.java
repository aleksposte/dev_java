package module_1_5_tasks.lessons.abstractFactory.banking;

import module_1_5_tasks.lessons.abstractFactory.ProjectManager;
import module_1_5_tasks.lessons.abstractFactory.ProjectTeamFactory;
import module_1_5_tasks.lessons.abstractFactory.Tester;
import module_1_5_tasks.lessons.factoryMethod.Developer;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
