package seminars.solid_principle.lsp2.model;

public class OrderBonus extends Order{

    public OrderBonus(int quantity, int price) {
        super(quantity, price);
    }

    @Override
    public int getAmount() {
        return quantity * price;
    }
}
