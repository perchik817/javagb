package seminars.lesson005.com.ex.demo.service;

import seminars.lesson005.com.ex.demo.db.Database;
import seminars.lesson005.com.ex.demo.model.Student;
import seminars.lesson005.com.ex.demo.model.StudyGroup;
import seminars.lesson005.com.ex.demo.model.Teacher;
import seminars.lesson005.com.ex.demo.model.User;

import java.util.List;

public interface UserService<T extends User> {
    T createUser(String name, String surname);

    T getUserById(int id) throws Exception;

    List<T> getAllUsers();
}
