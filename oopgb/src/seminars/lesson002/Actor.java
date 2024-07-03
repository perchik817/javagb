package seminars.lesson002;

import seminars.lesson001.Product;

import java.util.ArrayList;
import java.util.List;

public abstract class Actor implements ActorBehavior{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    protected List<Product> order;

    public Actor(String name) {
        this.name = name;
        this.isMakeOrder = false;
        this.isTakeOrder = false;
        this.order = new ArrayList<>();
    }

    public abstract String getName();

    @Override
    public void setMakeOrder(boolean makeOrder, List<Product> order) {
        isMakeOrder = makeOrder;
        this.order = order;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    public List<Product> getOrder() {
        return order;
    }
}
