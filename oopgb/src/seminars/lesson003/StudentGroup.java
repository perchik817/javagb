package seminars.lesson003;

import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {

    StringBuilder students = new StringBuilder();
    public void addStudent(Student student) {
        students.append(student).append("\n");
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
}
