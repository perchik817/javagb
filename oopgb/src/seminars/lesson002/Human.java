package seminars.lesson002;

public class Human extends Actor{

    public Human(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", isMakeOrder=" + isMakeOrder +
                ", isTakeOrder=" + isTakeOrder +
                ", order=" + order +
                '}';
    }
}
