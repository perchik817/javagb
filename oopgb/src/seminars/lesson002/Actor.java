package seminars.lesson002;

public abstract class Actor implements ActorBehavior{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name, boolean isMakeOrder, boolean isTakeOrder) {
        this.name = name;
        this.isMakeOrder = isMakeOrder;
        this.isTakeOrder = isTakeOrder;
    }

    public abstract String getName();
}
