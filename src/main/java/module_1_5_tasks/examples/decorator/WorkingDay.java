package module_1_5_tasks.examples.decorator;

public class WorkingDay {
    public static void main(String[] args) {
        Worker cleaner = new Cleaner();
        Worker dishwasher = new Dishwasher(new Cleaner());
        Worker cook = new Cook(new Dishwasher(new Cleaner()));

        System.out.println(cleaner.makeJob());
        System.out.println(dishwasher.makeJob());
        System.out.println(cook.makeJob());
    }
}
