package module_1_5_tasks.lessons.abstractFactory;

import module_1_5_tasks.lessons.abstractFactory.banking.BankingTeamFactory;
import module_1_5_tasks.lessons.factoryMethod.Developer;

public class InternetBankProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer =  projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank project... ");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
