package seminars.lesson004.controllers;

import seminars.lesson004.models.Teacher;
import seminars.lesson004.models.User;
import seminars.lesson004.view.TeacherView;
import seminars.lesson004.view.UserView;

import java.util.List;

public class TeacherController implements UserController {
    private UserView<Teacher> view = new TeacherView();
    @Override
    public <T extends User> User create(T teacher) {
        return teacher;
    }
    public void sendOnConsole(List<Teacher> teachers){
        System.out.println(teachers);
    }
}
