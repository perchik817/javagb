package seminars.solid_principle.lsp2.model;

public class Order {
    protected final int price;
    protected final int quantity;

    public Order(int quantity, int price) {
        this.price = price;
        this.quantity = quantity;
    }

    public int getAmount() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return String.format("Quantity = %d, Price = %d", quantity, price);
    }
}
