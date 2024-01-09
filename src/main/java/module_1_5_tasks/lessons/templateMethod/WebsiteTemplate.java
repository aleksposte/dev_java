package module_1_5_tasks.lessons.templateMethod;

public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("abstract header");
        showPageContent();
        System.out.println("abstract footer");
    }

    public abstract void showPageContent();
}
