package seminars.lesson004;

import seminars.lesson004.controllers.StudyGroupController;
import seminars.lesson004.models.StudyGroup;
import seminars.lesson004.services.StudyGroupService;

public class Main {
    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        StudyGroupService studyGroupService = new StudyGroupService(studyGroup);
        StudyGroupController controller = new StudyGroupController(studyGroupService);
    }
}
