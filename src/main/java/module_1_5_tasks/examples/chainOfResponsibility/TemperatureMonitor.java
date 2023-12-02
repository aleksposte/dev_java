package module_1_5_tasks.examples.chainOfResponsibility;

public class TemperatureMonitor {
    public static void main(String[] args) {
        Notifier temperatureNotifier = new NormalOvenTemperature(Priority.NORMAL);
        Notifier temperatureHighNotifier = new HighOvenTemperature(Priority.HOT);
        Notifier temperatureOverNotifier = new OverheadOvenTemperature(Priority.OVERHEAT);

        temperatureNotifier.setNextNotifier(temperatureHighNotifier);
        temperatureHighNotifier.setNextNotifier(temperatureOverNotifier);

        temperatureNotifier.notifierManager("Everything is Ok", Priority.NORMAL);
        temperatureNotifier.notifierManager("Something went wrong", Priority.HOT);
        temperatureNotifier.notifierManager("Overhead!!!", Priority.OVERHEAT);
    }
}
