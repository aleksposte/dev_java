package module_1_5_tasks.examples.bridge;

public class CoffeeCreator {
    public static void main(String[] args) {
         Cap[] caps = {
             new SmallCap(new LatteCoffee()),
             new BigCap(new AmericanoCoffee())
         };

         for (Cap cap : caps) {
             cap.orderPreparation();
         }
    }
}
