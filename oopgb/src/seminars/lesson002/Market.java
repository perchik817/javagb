package seminars.lesson002;

import seminars.lesson001.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour{
    private List<Actor> actors = new ArrayList<>();
    private Queue<Actor> queue = new LinkedList<>();

    @Override
    public void acceptToMarket(Actor actor) {
        if(!actors.contains(actor)){
            actors.add(actor);
            System.out.println(actor.getName() + " accepted to market.");
        } else {
            System.out.println(actor.getName() + " already accepted to market.");
        }
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        if(actors.contains(actor)){
            System.out.println(actor.getName() + " released from market.");
            actors.remove(actor);
        } else {
            System.out.println(actor.getName() + " already released from market.");
        }
    }

    @Override
    public void update() {
        giveOrders();
        releaseFromQueue();
        System.out.println("Market state updated.");
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " took into queue.");
    }

    //сделать заказ
    @Override
    public void takeOrders(Actor actor, List<Product> order) {
        if (!actor.isMakeOrder()) {
            actor.setMakeOrder(true, order);
            System.out.println(actor.getName() + " made an order.");
        }
    }

    // забрать заказы
    @Override
    public void giveOrders() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder() && !actor.isTakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " took the order: " + actor.getOrder());
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                releasedActors.add(actor);
                System.out.println(actor.getName() + " released from queue.");
            }
        }
        queue.removeAll(releasedActors);
    }
}
