package seminars.lesson003;

public class Student implements Comparable<Student>{

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
//        if(o.name.length() > this.name.length()) return -1;
//        else if(o.name.length() < this.name.length()) return 1;
//        else return 0;
        return o.name.length() - this.name.length();
    }
}
