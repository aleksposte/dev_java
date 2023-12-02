package module_1_5_tasks.lessons.builder;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.builsCms();
        builder.builPrice();

        Website website = builder.getWebsite();

        return website;
    }
}
