package module_1_5_tasks.examples.facade;

public class MakeOrderRunning {
    Cook cook = new Cook();
    Cooking cooking = new Cooking();
    OrderForCooking orderForCooking = new OrderForCooking();

    public void CookingOrder() {
        orderForCooking.startPizzaCooking();
        cooking.cookingPizza();
        cook.receiveOrder(orderForCooking);
    }
}
