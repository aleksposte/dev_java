package module_1_5_tasks.lessons.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
         Program [] programs = {
                 new BankSystem(new JavaDeveloper()),
                 new StockExchange(new JavaDeveloper())
         };

         for (Program program: programs) {
             program.developProgram();
         }
    }
}
