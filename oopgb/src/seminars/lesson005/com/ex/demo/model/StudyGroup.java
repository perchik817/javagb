package seminars.lesson005.com.ex.demo.model;

import java.util.List;

public class StudyGroup {
    private int id;
    private List<Student> students;
    private Teacher teacher;

    public StudyGroup(int id, Teacher teacher, List<Student> students) {
        this.id = id;
        this.teacher = teacher;
        this.students = students;
    }

    public int getId() {
        return id;
    }
}
