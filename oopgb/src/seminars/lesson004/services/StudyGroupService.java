package seminars.lesson004.services;

import seminars.lesson004.models.StudyGroup;
import seminars.lesson004.models.Student;

import java.util.Collections;
import java.util.List;

public class StudyGroupService {
    private StudyGroup studyGroup;
    public StudyGroupService(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }
    public void addStudent(Student student) {
        studyGroup.students.add(student);
    }
    public List<Student> sortStudyGroup(){
        Collections.sort(studyGroup.students);
        return studyGroup.students;
    }
}
