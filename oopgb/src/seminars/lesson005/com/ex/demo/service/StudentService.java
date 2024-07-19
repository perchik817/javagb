package seminars.lesson005.com.ex.demo.service;

import seminars.lesson005.com.ex.demo.db.Database;
import seminars.lesson005.com.ex.demo.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {

    @Override
    public Student createUser(String name, String surname) {
        int id;
        int size = Database.studentsDb.size();
        if(size == 0) id = 1;
        else id = size + 1;
        Student s = new Student(id, name, surname);
        Database.studentsDb.add(s);
        return s;
    }

    @Override
    public Student getUserById(int id) throws Exception {
        Student student = Database.studentsDb
                .stream() //запускаем поток для вычислений
                .filter(s -> s.getId() == id) //вызываем метод filter фильтруя по условию (s = student(переменная))
                .findFirst() //вернуть первого найденного студента
                .orElse(null); // если не нашли ни одного, вернуть null (orElse закрывает поток stream)
        if (student == null) throw new Exception("Student not found"); //checked ex
//        return Database.studentsDb.get(id);
        return student;
    }

    @Override
    public List<Student> getAllUsers() {
        return Database.studentsDb;
    }

    public List<Student> getStudentsByIds(List<Integer> ids) throws Exception {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < Database.studentsDb.size(); i++) {
            if(ids.contains(Database.studentsDb.get(i).getId())) {
                students.add(Database.studentsDb.get(i));
            }
        }
        return students;
    }

}
