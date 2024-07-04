package seminars.lesson003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudyGroupService {
    private StudentGroup studentGroup;
    public StudyGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
    public void removeStudentByName(String name) {
        StringBuilder updatedStudents = new StringBuilder();
        String[] names = studentGroup.students.toString().split(" ");
        for (String studentName : names) {
            if (!studentName.equals(name)) {
                updatedStudents.append(studentName).append(" ");
            }
        }
        studentGroup.students = updatedStudents;
    }

    public void compareById(){
        List<Student> studentList = new ArrayList<>();
        for(Student s : studentGroup){
            studentList.add(s);
        }
        Collections.sort(studentList, new StudentComparator());
    }
}
