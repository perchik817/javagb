package seminars.lesson005.com.ex.demo.service;

import seminars.lesson005.com.ex.demo.db.Database;
import seminars.lesson005.com.ex.demo.model.Student;

import java.util.List;

public class StudentService {
    public Student createStudent(String name, String surname, int groupId){
        int id;
        int size = Database.studentsDb.size();
        if(size == 0) id = 1;
        else id = size + 1;
        Student s = new Student(id, name, surname, groupId);
        Database.studentsDb.add(s);
        return s;
    }

    public Student getStudentById(int id) throws Exception {
        Student student = Database.studentsDb
                .stream() //запускаем поток для вычислений
                .filter(s -> s.getId() == id) //вызываем метод filter фильтруя по условию (s = student(переменная))
                .findFirst() //вернуть первого найденного студента
                .orElse(null); // если не нашли ни одного, вернуть null (orElse закрывает поток stream)
        if (student == null) throw new Exception("Student is not found"); //checked ex
//        return Database.studentsDb.get(id);
        return student;
    }

    public List<Student> getAllStudents(){
        return Database.studentsDb;
    }
}
