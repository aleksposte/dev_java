package module_1_5_tasks.examples.chainOfResponsibility;

public class OverheadOvenTemperature extends Notifier {
    public OverheadOvenTemperature(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Temperature 1000 " + message);
    }
}
