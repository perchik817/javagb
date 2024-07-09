package seminars.lesson004.view;

import seminars.lesson004.models.Student;

import java.util.List;

public class StudentView implements UserView<Student> {
    @Override
    public void sendOnConsole(List<Student> students) {
        System.out.println(students);
    }
}
