package seminars.lesson005.com.ex.demo.service;

import seminars.lesson005.com.ex.demo.db.Database;
import seminars.lesson005.com.ex.demo.model.Teacher;

import java.util.List;

public class TeacherService implements UserService<Teacher> {
    @Override
    public Teacher createUser(String name, String surname) {
        int id;
        int size = Database.teacherDb.size();
        if (size == 0) id = 1;
        else id = size + 1;
        Teacher teacher = new Teacher(id, name, surname);
        Database.teacherDb.add(teacher);
        return teacher;
    }

    @Override
    public Teacher getUserById(int id) throws Exception {
        Teacher teacher = Database.teacherDb.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
        if (teacher == null) throw new Exception("Teacher is not found");
        return teacher;
    }

    @Override
    public List<Teacher> getAllUsers() {
        return Database.teacherDb;
    }


    // final у примитива = константа, у ссылочных - ссылка не меняется, но содержимое изменяемое

//    private final List<Integer> groups = new ArrayList<>();
//    public void addGroupId(int id){
//        groups.add(id);
//    }
}
