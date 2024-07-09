package seminars.lesson004.controllers;

import seminars.lesson004.models.Student;
import seminars.lesson004.models.User;
import seminars.lesson004.view.StudentView;
import seminars.lesson004.view.UserView;

import java.util.List;

public class StudentController implements UserController{
    private UserView<Student> studentView = new StudentView();
    @Override
    public <T extends User> User create(T user) {
        return user;
    }
    public void sendOnConsole(List<Student> students){
        studentView.sendOnConsole(students);
    }
}
