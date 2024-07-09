package seminars.lesson004.models;

public class Student extends User{

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("Student [id=%d, name=%s, surname=%s]", id, name, surname);
    }
}
