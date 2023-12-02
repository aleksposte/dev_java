package module_1_5_tasks.lessons.proxy;

public class RealProject implements Project{
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    private void load() {
        System.out.println("loading project from " + url + " ...");
    }

    @Override
    public void run() {
        System.out.println("running project " + url + " ...");
    }
}
