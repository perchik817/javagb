package seminars.lesson005.com.ex.demo.view;

import seminars.lesson005.com.ex.demo.controller.StudyGroupController;
import seminars.lesson005.com.ex.demo.model.StudyGroup;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudyGroupView {
    private final StudyGroupController controller = new StudyGroupController();
    public void start(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("----WORK WITH STUDY GROUPS----" +
                    "\n1. Create study group" +
                    "\n2. Get study group by id" +
                    "\n3. Get all study groups" +
                    "\n4. Go back to the main view");
            switch (scanner.nextInt()){
                case 1 -> {
                    try {
                        createStudyGroup();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                case 2 -> getStudyGroupById();
                case 3 -> getAllGroups();
                case 4 -> {return;}
                default -> System.out.println("Invalid option");
            }
        }
    }

    private StudyGroup createStudyGroup() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter teacher's id: ");
        int tId = scanner.nextInt();
        System.out.println("Enter list of students ids (separated by space): ");
        String studentsIds = scanner.nextLine();
        List<Integer> ids = Arrays.stream(studentsIds.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        StudyGroup g = controller.createStudyGroup(tId, ids);
        System.out.println(g);
        return g;
    }

    public StudyGroup getStudyGroupById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter study group's id: ");
        int id = scanner.nextInt();
        StudyGroup g = controller.getStudyGroupById(id);
        System.out.println(g);
        return g;
    }

    public List<StudyGroup> getAllGroups(){
        List<StudyGroup> gList = controller.getAllStudyGroups();
        System.out.println(gList);
        return gList;
    }
}
