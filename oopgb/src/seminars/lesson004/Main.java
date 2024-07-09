package seminars.lesson004;

import seminars.lesson004.controllers.StudentController;
import seminars.lesson004.models.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Andrey", "Alexandrov"),
                        new Student(2, "Anastasiya", "Semenova")));

    }
}
