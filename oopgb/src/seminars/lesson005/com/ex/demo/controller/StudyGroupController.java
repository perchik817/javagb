package seminars.lesson005.com.ex.demo.controller;

import seminars.lesson005.com.ex.demo.model.StudyGroup;
import seminars.lesson005.com.ex.demo.service.StudyGroupService;

import java.util.List;

public class StudyGroupController {
    private final StudyGroupService service = new StudyGroupService();

    public StudyGroup createStudyGroup(int tId, List<Integer> sList) throws Exception {
        return service.createStudyGroup(tId, sList);
    }

    public StudyGroup getStudyGroupById(int id){
        try{
            return service.getStudyGroupById(id);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public List<StudyGroup> getAllStudyGroups(){
        return service.getAllStudyGroups();
    }
}
