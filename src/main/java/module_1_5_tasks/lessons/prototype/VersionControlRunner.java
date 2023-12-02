package module_1_5_tasks.lessons.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "master project", "sourceCode");

        System.out.println(master);

        // v1
        Project masterClone = (Project) master.copy();
        System.out.println(masterClone);

        // v2
        ProjectFactory factory = new ProjectFactory(master);
        Project masterCloneV2 = factory.cloneProject();
        System.out.println(masterCloneV2);
    }
}
