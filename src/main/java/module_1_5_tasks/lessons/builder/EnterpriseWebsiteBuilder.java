package module_1_5_tasks.lessons.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("EnterpriseWebsite");
    }

    @Override
    void builsCms() {
        website.setCms(Cms.JOOMLA);
    }

    @Override
    void builPrice() {
    website.setPrice(1000);
    }
}
