package seminars.lesson004.services;

import seminars.lesson004.models.Student;

public class StudentService {
    public Student createStudent(int id, String name, String surname){
        return new Student(id, name, surname);
    }
}
