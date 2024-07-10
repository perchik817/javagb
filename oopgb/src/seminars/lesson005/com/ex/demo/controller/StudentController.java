package seminars.lesson005.com.ex.demo.controller;

import seminars.lesson005.com.ex.demo.model.Student;
import seminars.lesson005.com.ex.demo.service.StudentService;

import java.util.List;

public class StudentController {
    private final StudentService service = new StudentService();

    public Student createStudent(String name, String surname, int groupId){
        return service.createStudent(name, surname, groupId);
    }

    public Student getStudentById(int id){
        try {
            return service.getStudentById(id);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }
}