package seminars.lesson002;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{
    private List<Actor> actors = new ArrayList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        actors.remove(0);
    }

    @Override
    public void update() {
//TODO args and create productsList
    }

    @Override
    public void takeInQueue(Actor actor) {

    }

    @Override
    public void takeOrders() {

    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }
}
