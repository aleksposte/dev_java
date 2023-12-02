package module_1_5_tasks.examples.chainOfResponsibility;

public class HighOvenTemperature extends Notifier {

    public HighOvenTemperature(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Temperature 600 " + message);
    }
}
