package module_1_5_tasks.examples.chainOfResponsibility;

public class NormalOvenTemperature extends Notifier {

    public NormalOvenTemperature(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Temperature 200 " + message);
    }
}
