package seminars.lesson003;

public class Controller {
    private StudyGroupService studyGroupService;
    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }
    public void removeStudent(String name){
        studyGroupService.removeStudentByName(name);
        System.out.println("Student " + name + " has been removed.");
    }

    public void sortStudentsById() {
        studyGroupService.compareById();
        System.out.println("Students have been sorted by ID.");
    }
}
