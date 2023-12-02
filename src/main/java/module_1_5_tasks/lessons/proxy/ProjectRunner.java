package module_1_5_tasks.lessons.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.project/realproject");

        project.run();
    }
}
