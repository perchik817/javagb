package seminars.lesson005.com.ex.demo.controller;

import seminars.lesson005.com.ex.demo.model.Teacher;
import seminars.lesson005.com.ex.demo.service.TeacherService;

import java.util.List;

public class TeacherController {
    private final TeacherService service = new TeacherService();

    public Teacher createTeacher(String firstName, String lastName) {
        return service.createUser(firstName, lastName);
    }

    public Teacher getTeacherById(int id) {
        try {
            return service.getUserById(id);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Teacher> getAllTeachers() {
        return service.getAllUsers();
    }
}
