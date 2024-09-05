package seminars.lesson007.ooppatterns.generating.builder.task.item.impl;

import seminars.lesson007.ooppatterns.generating.builder.task.item.Characteristic;
import seminars.lesson007.ooppatterns.generating.builder.task.item.Item;

public class Bike extends Item {

    public Bike(Characteristic characteristic) {
        super(characteristic);
    }


    @Override
    public Characteristic getCharacteristic() {
        return characteristic;
    }
}
