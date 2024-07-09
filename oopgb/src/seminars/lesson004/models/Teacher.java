package seminars.lesson004.models;

public class Teacher extends User{

    public Teacher(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Teacher [id=%d, name=%s, surname=%s]", id, name, surname);
    }
}
