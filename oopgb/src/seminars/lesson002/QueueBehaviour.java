package seminars.lesson002;

import seminars.lesson001.Product;

import java.util.List;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders(Actor actor, List<Product> order);
    void giveOrders();
    void releaseFromQueue();
}
