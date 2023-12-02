package module_1_5_tasks.lessons.abstractFactory.website;

import module_1_5_tasks.lessons.abstractFactory.ProjectManager;
import module_1_5_tasks.lessons.abstractFactory.ProjectTeamFactory;
import module_1_5_tasks.lessons.abstractFactory.Tester;

//public class WebsiteTeamFactory implements ProjectTeamFactory {
//    @Override
//    public Developer getDeveloper() {
//        return new PhpDeveloper();
//    }
//
//    @Override
//    public Tester getTester() {
//        return new ManualTester();
//    }
//
//    @Override
//    public ProjectManager getProjectManager() {
//        return new WebsitePM();
//    }
//}

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public PhpDeveloper getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
