package seminars.lesson002;

import seminars.lesson001.Product;

import java.util.List;

public interface ActorBehavior {
    void setMakeOrder(boolean makeOrder, List<Product> order);
    void setTakeOrder(boolean takeOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
}
