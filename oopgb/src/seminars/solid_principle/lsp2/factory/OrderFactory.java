package seminars.solid_principle.lsp2.factory;

import seminars.solid_principle.lsp2.model.*;

public class OrderFactory {
    public Order create(int quantity, int price, boolean isBonus) {
        if (isBonus) {
            return new OrderBonus(quantity, price);
        }
        return new Order(quantity, price);
    }
}
