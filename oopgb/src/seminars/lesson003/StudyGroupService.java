package seminars.lesson003;

public class StudyGroupService {
    private StudentGroup studentGroup;
    public StudyGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }
    public void removeStudentByName(String name) {
        StringBuilder updatedStudents = new StringBuilder();
        String[] names = studentGroup.students.toString().split("\n");
        for (String studentName : names) {
            if (!studentName.equals(name)) {
                updatedStudents.append(studentName).append("\n");
            }
        }
        studentGroup.students = updatedStudents;
    }
}
