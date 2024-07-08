package seminars.lesson004.models;

import java.time.LocalDate;

public class Teacher extends User{

    public Teacher(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
