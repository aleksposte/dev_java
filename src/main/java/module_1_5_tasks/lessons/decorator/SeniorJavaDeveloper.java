package module_1_5_tasks.lessons.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "make code review...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
