package module_1_5_tasks.examples.decorator;

public class Cook extends WorkerDecorator {
    public Cook(Worker worker) {
        super(worker);
    }

    public String makeCookJob() {
        return "cook cooked pizza...";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCookJob();
    }
}
