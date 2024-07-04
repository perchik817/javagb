package seminars.lesson003;

import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;
    private StreamService streamService;

    public Controller(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    public Controller(StreamService streamService) {
        this.streamService = streamService;
    }

    public void removeStudent(String name){
        studyGroupService.removeStudentByName(name);
        System.out.println("Student " + name + " has been removed.");
    }

    public void sortStudentsById() {
        studyGroupService.compareById();
        System.out.println("Students have been sorted by ID.");
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
        System.out.println("Streams have been sorted by number of groups.");
    }
}
