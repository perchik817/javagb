package seminars.lesson004.services;

import seminars.lesson004.models.Teacher;

public class TeacherService {
    public Teacher createTeacher(int id, String name, String surname){
        return new Teacher(id, name, surname);
    }
}
