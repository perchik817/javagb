package seminars.lesson001.impl;

import seminars.lesson001.Product;
import seminars.lesson001.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageVendingMachine extends VendingMachine {
    public HotBeverageVendingMachine() {}

    public Product getProduct(String name, double volume, int temperature){
        //simple without using threads
        for (Product product : getProducts()) {
            if (product instanceof HotBeverage) {
                HotBeverage hotBeverage = (HotBeverage) product;
                if (hotBeverage.getName().equals(name) &&
                        hotBeverage.getVolume() == volume &&
                        hotBeverage.getTemperature() == temperature) {
                    return hotBeverage;
                }
            }
        }
        return null;

//        return getProducts().stream()
//                .filter(product -> product instanceof HotBeverage)
//                .map(product -> (HotBeverage) product)
//                .filter(hotBeverage -> hotBeverage.getName().equals(name) &&
//                        hotBeverage.getVolume() == volume &&
//                        hotBeverage.getTemperature() == temperature)
//                .findFirst()
//                .orElse(null);


    }
}
