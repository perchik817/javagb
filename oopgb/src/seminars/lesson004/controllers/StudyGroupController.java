package seminars.lesson004.controllers;

import seminars.lesson004.models.Student;
import seminars.lesson004.services.StudyGroupService;

public class StudyGroupController {
    private StudyGroupService service;
    public StudyGroupController(StudyGroupService service) {
        this.service = service;
    }
    public void addStudent(Student student) {
        service.addStudent(student);
    }
}
