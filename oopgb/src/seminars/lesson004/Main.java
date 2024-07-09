package seminars.lesson004;

import seminars.lesson004.controllers.StudentController;
import seminars.lesson004.controllers.TeacherController;
import seminars.lesson004.models.Student;
import seminars.lesson004.models.Teacher;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        new StudentController()
                .sendOnConsole(List.of(new Student(1, "Andrey", "Alexandrov"),
                        new Student(2, "Anastasiya", "Semenova")));

        new TeacherController()
                .sendOnConsole(List.of(new Teacher(1, "Mariya", "Leonidova"),
                        new Teacher(2, "Pavel", "Belokon")));
    }
}
