package seminars.lesson002;

import seminars.lesson001.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Home Work
         * Реализовать класс Market и все методы, которые он обязан реализовывать. Методы из интерфейса QueueBehaviour,
         * имитируют работу очереди, MarketBehaviour – помещает и удаляет человека из очереди, метод update – обновляет
         * состояние магазина (принимает и отдает заказы)
         * */
        Market market = new Market();
        Human john = new Human("John");
        Human jane = new Human("Jane");
        Actor melani = new Human("Melani");

        market.acceptToMarket(john);
        market.acceptToMarket(jane);
        market.acceptToMarket(melani);

        market.takeInQueue(john);
        market.takeInQueue(jane);
        market.takeInQueue(melani);

        List<Product> order = new ArrayList<>();
        order.add(new Product("Apple", 27, LocalDate.now()));
        order.add(new Product("Banana", 103, LocalDate.of(2024, 5, 5)));
        order.add(new Product("Oreo", 132, LocalDate.of(2024, 1, 17)));

        market.takeOrders(jane, List.of(new Product("Apple", 27, LocalDate.now())));
        market.takeOrders(john, List.of(new Product("Apple", 27, LocalDate.now()),
                new Product("Banana", 103, LocalDate.of(2024, 5, 5))));
        market.takeOrders(melani, order);

        market.releaseFromMarket(john);
        market.releaseFromMarket(jane);

        market.update();
    }
}
