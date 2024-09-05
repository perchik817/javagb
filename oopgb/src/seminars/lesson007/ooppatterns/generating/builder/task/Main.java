package seminars.lesson007.ooppatterns.generating.builder.task;

import seminars.lesson007.ooppatterns.generating.builder.task.item.Characteristic;
import seminars.lesson007.ooppatterns.generating.builder.task.item.Item;
import seminars.lesson007.ooppatterns.generating.builder.task.item.impl.Bike;

/**
 Using the builder pattern, correct the characteristic class code
 */
public class Main {
    public static void main(String[] args) {
        Item bike = new Bike(
                new Characteristic(
                        "brand", "color", "ram", "cpu", "os", "weight", "memory",
                        "memoryType", "battery", "body", "wheel")
        );

        System.out.println(bike);
    }
}
