package module_1_5_tasks.lessons.builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void builsCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void builPrice() {
        website.setPrice(500);
    }
}
