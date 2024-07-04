package seminars.lesson003;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    private StudentGroup studentGroup = new StudentGroup();
    private int index = 0;
    private Student[] students;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
        this.students = getStudents();
    }

    private Student[] getStudents(){
        String[] names = studentGroup.students.toString().split(" ");
        Student[] studentsArr = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            studentsArr[i] = new Student(names[i]);
        }
        return studentsArr;
    }

    @Override
    public boolean hasNext() {
        return index < getStudents().length;
    }

    @Override
    public Student next() {
        return getStudents()[index++];
    }

}
