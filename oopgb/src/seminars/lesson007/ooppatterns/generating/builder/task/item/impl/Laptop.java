package seminars.lesson007.ooppatterns.generating.builder.task.item.impl;

import seminars.lesson007.ooppatterns.generating.builder.task.item.Characteristic;
import seminars.lesson007.ooppatterns.generating.builder.task.item.Item;

public class Laptop extends Item {

    public Laptop(Characteristic characteristic) {
        super(characteristic);
    }

    @Override
    public Characteristic getCharacteristic() {
        return characteristic;
    }
}
