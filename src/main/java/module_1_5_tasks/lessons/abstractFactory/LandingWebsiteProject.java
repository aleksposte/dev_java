package module_1_5_tasks.lessons.abstractFactory;

import module_1_5_tasks.lessons.abstractFactory.website.WebsiteTeamFactory;
import module_1_5_tasks.lessons.factoryMethod.Developer;

public class LandingWebsiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating landing project...");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
