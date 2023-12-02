package module_1_5_tasks.lessons.bridge;

public class BankSystem extends Program{
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("bank system development in progress...");
        developer.writeCode();
    }
}
