package seminars.lesson001;

import seminars.lesson001.impl.Package;
import seminars.lesson001.impl.WaterBottle;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /** task1
        * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
        initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)
        *
        * task2
        * Реализуйте конструкторы, get/set методы, постройте логику ТорговогоАвтомата на основе кода
        сделанного в предыдущем задании.
        *
        * task3
        * Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
        сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа
        ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)
        *
        * task4
        * Переопределите метод toString для Товара, запустите программу, после этого переопределите для
        наследника этот метод, после запуска обратите внимание на изменение поведения.
        Создайте перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным
        входным параметром (пример: getProduct(String name) выдающий товар по имени, создайте метод
        возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume)
        * */

        Product bottle1 = new WaterBottle("H2O", 48, LocalDate.now());
        Product bottle2 = new WaterBottle("Borjomi", 108, LocalDate.now(), 1.5F, Package.GLASS.getMaterial(), true);
        VendingMachine vm = new VendingMachine();
        vm.initProducts(List.of(bottle1, bottle2));
        System.out.println(vm.getProducts());
        System.out.println(vm.getProduct("Borjomi"));
    }
}
