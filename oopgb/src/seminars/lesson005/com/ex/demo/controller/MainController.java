package seminars.lesson005.com.ex.demo.controller;

import seminars.lesson005.com.ex.demo.db.Database;
import seminars.lesson005.com.ex.demo.model.Student;
import seminars.lesson005.com.ex.demo.model.StudyGroup;
import seminars.lesson005.com.ex.demo.model.Teacher;
import seminars.lesson005.com.ex.demo.service.TeacherService;
import seminars.lesson005.com.ex.demo.view.StudentView;
import seminars.lesson005.com.ex.demo.view.StudyGroupView;
import seminars.lesson005.com.ex.demo.view.TeacherView;

import java.util.List;

public class MainController {
    private final StudentView studentView;
    private final TeacherView teacherView;
    private final StudyGroupView studyGroupView;

    public MainController(StudentView studentView, TeacherView teacherView, StudyGroupView studyGroupView) {
        this.studentView = studentView;
        this.teacherView = teacherView;
        this.studyGroupView = studyGroupView;
    }

    public StudentView getStudentView() {
        return studentView;
    }

    public TeacherView getTeacherView() {
        return teacherView;
    }

    public StudyGroupView getStudyGroupView() {
        return studyGroupView;
    }

    public void fillDb(){
        TeacherService teacherService = new TeacherService();

        Teacher t1 = new Teacher(1, "Mavlyuda", "Shavkatova");
//        teacherService.addGroupId(1);
        Teacher t2 = new Teacher(2, "Janet", "Kadyrova");
        Database.teacherDb.add(t1);
        Database.teacherDb.add(t2);

        Student s1 = new Student(1, "Tony", "Stark");
        Student s2 = new Student(2, "Robert", "Grizzly");
        Student s3 = new Student(3, "Manas", "Sagymbai");
        Student s4 = new Student(4, "Ruslan", "Akun");
        Database.studentsDb.add(s1);
        Database.studentsDb.add(s2);
        Database.studentsDb.add(s3);
        Database.studentsDb.add(s4);

        StudyGroup g1 = new StudyGroup(1, t1, List.of(s1, s3));
        StudyGroup g2 = new StudyGroup(2, t2, List.of(s2, s4));
        Database.studyGroupsDb.add(g1);
        Database.studyGroupsDb.add(g2);
    }
}
