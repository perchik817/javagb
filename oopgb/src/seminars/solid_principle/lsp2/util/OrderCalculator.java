package seminars.solid_principle.lsp2.util;

import seminars.solid_principle.lsp2.model.Order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderCalculator implements Iterable<Order> {
    private List<Order> orders = new ArrayList<>();

    public void add(Order order) {
        orders.add(order);
    }

    public int calcAmount() {
        int sum = 0;
        for (Order order : orders) {
            sum += order.getAmount();
        }
        return sum;
    }

    @Override
    public Iterator<Order> iterator() {
        return orders.iterator();
    }
}
