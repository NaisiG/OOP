package HomeWork06.Solid2Srp2.src.solid;

import HomeWork06.Solid2Srp2.src.solid.srp.models.FactoryCreator;
import HomeWork06.Solid2Srp2.src.solid.srp.models.Order;
import HomeWork06.Solid2Srp2.src.solid.srp.models.SaveToJson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new FactoryCreator().inputFromConsole();
        new SaveToJson(order).save();
    }
}
