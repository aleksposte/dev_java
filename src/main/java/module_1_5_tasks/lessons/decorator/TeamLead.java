package module_1_5_tasks.lessons.decorator;

public class TeamLead extends DeveloperDecorator{
    public TeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekkReport() {
        return "send week report to customer...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekkReport();
    }
}
