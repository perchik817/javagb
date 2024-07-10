package seminars.lesson005.com.ex.demo.model;

public class Student extends User{
    private int groupId;
    public Student(int id, String name, String surname, int groupId) {
        super(id, name, surname);
        this.groupId = groupId;
    }
}
