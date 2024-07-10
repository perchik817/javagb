package seminars.lesson005.com.ex.demo.db;

import seminars.lesson005.com.ex.demo.model.Student;
import seminars.lesson005.com.ex.demo.model.Teacher;
import seminars.lesson005.com.ex.demo.service.TeacherService;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static final List<Student> studentsDb = new ArrayList<>();
    public static final List<Teacher> teacherDb = new ArrayList<>();
    static final TeacherService teacherService = new TeacherService();

    //TODO move this method to the service
    public static void fillDb(){
        Teacher t1 = new Teacher(1, "Mavlyuda", "Shavkatovna");
        teacherService.addGroupId(1);
        teacherDb.add(t1);

        Student s1 = new Student(1, "Tony", "Stark", 1);
        Student s2 = new Student(2, "Robert", "Grizzly", 1);
        studentsDb.add(s1);
        studentsDb.add(s2);
    }
}
