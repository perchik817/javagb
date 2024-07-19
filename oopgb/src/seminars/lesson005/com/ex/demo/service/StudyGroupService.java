package seminars.lesson005.com.ex.demo.service;

import seminars.lesson005.com.ex.demo.db.Database;
import seminars.lesson005.com.ex.demo.model.Teacher;
import seminars.lesson005.com.ex.demo.model.Student;
import seminars.lesson005.com.ex.demo.model.StudyGroup;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {

    private final TeacherService teacherService = new TeacherService();
    private final StudentService studentService = new StudentService();

    public StudyGroup createStudyGroup(int tId, List<Integer> sIds) throws Exception {
        Teacher t = teacherService.getUserById(tId);
        List<Student> sList = studentService.getStudentsByIds(sIds);
        int id;
        int size = Database.studyGroupsDb.size();
        if(size == 0) id = 0;
        else id = size + 1;
        StudyGroup g = new StudyGroup(id, t, sList);
        Database.studyGroupsDb.add(g);
        return g;
    }

    public StudyGroup getStudyGroupById(int id) throws Exception {
        StudyGroup group = Database.studyGroupsDb.stream().filter(g -> g.getId() == id).findFirst().orElse(null);
        if (group == null) throw new Exception("StudyGroup not found");
        return group;
    }

    public List<StudyGroup> getAllStudyGroups(){
        return Database.studyGroupsDb;
    }

}
