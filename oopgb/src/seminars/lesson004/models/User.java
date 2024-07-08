package seminars.lesson004.models;

import seminars.lesson004.util.UserComparator;

import java.time.LocalDate;
import java.util.Comparator;

public abstract class User extends UserComparator<User> implements Comparable<User> {
    protected int id;
    protected String name;
    protected String surname;

    @Override
    public int compareTo(User o) {
        return compare(this, o);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
