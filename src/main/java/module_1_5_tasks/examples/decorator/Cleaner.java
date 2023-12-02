package module_1_5_tasks.examples.decorator;

public class Cleaner implements Worker {
    @Override
    public String makeJob() {
        return "cleaner takes out the trash...";
    }
}
