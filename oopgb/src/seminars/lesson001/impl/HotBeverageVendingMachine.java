package seminars.lesson001.impl;

import seminars.lesson001.Product;
import seminars.lesson001.VendingMachine;

public class HotBeverageVendingMachine extends VendingMachine {
    public HotBeverageVendingMachine() {}

    //@Override
    public Product getProduct(String name, double volume, int temperature){
        return getProducts().stream()
                .filter(product -> product instanceof HotBeverage)
                .map(product -> (HotBeverage) product)
                .filter(hotBeverage -> hotBeverage.getName().equals(name) &&
                        hotBeverage.getVolume() == volume &&
                        hotBeverage.getTemperature() == temperature)
                .findFirst()
                .orElse(null);
    }
}
