package seminars.lesson005.com.ex.demo.model;

public abstract class User {
    protected int id;
    protected String name;
    protected String surname;

    public User(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format(getClass().getSimpleName() + ": id = %s, name = %s, surname = %s", id, name, surname);
    }

    public int getId() {
        return id;
    }
}
