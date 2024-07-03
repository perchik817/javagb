package seminars.lesson002;

public class Human extends Actor{
    public Human(String name, boolean isMakeOrder, boolean isTakeOrder) {
        super(name, isMakeOrder, isTakeOrder);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        this.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        this.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
