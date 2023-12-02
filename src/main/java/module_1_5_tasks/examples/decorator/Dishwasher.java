package module_1_5_tasks.examples.decorator;

public class Dishwasher extends WorkerDecorator {
    public Dishwasher(Worker worker) {
        super(worker);
    }

    public String makeWasherJob() {
        return "dishwasher washes dishes...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeWasherJob();
    }
}
