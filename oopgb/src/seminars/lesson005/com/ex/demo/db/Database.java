package seminars.lesson005.com.ex.demo.db;

import seminars.lesson005.com.ex.demo.model.Student;
import seminars.lesson005.com.ex.demo.model.StudyGroup;
import seminars.lesson005.com.ex.demo.model.Teacher;
import seminars.lesson005.com.ex.demo.service.TeacherService;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static final List<Student> studentsDb = new ArrayList<>();
    public static final List<Teacher> teacherDb = new ArrayList<>();
    public static final List<StudyGroup> studyGroupsDb = new ArrayList<>();
}
