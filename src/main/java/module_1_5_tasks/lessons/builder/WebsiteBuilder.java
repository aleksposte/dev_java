package module_1_5_tasks.lessons.builder;

public abstract class WebsiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();
    abstract void builsCms();
    abstract void builPrice();

    Website getWebsite() {
        return website;
    }
}
