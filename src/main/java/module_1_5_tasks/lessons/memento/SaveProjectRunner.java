package module_1_5_tasks.lessons.memento;

import module_1_5_tasks.lessons.abstractFactory.Tester;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GitHubRepo github = new GitHubRepo();

        System.out.println("Createing new project v1.0");
        project.setVersionAndDate("version v1.0");

        System.out.println(project);

        System.out.println("saving to github");
        github.setSave(project.save());

        System.out.println("update project");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        project.setVersionAndDate("version v1.1");
        System.out.println(project);

        System.out.println("something went wrong...");
        System.out.println("rolling back to v1.0");
        project.load(github.getSave());

        System.out.println("project after roll back..");
        System.out.println(project);
    }
}
