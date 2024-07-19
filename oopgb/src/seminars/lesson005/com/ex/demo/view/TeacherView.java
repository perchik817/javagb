package seminars.lesson005.com.ex.demo.view;

import seminars.lesson005.com.ex.demo.controller.TeacherController;
import seminars.lesson005.com.ex.demo.model.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherView {

    private TeacherController controller = new TeacherController();

    public void start(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("------WORK WITH TEACHERS------" +
                    "\n1. Create teacher" +
                    "\n2. Get teacher by id" +
                    "\n3. Get all teachers" +
                    "\n4. Go back to the main view");
            switch (scanner.nextInt()){
                case 1 -> createTeacher();
                case 2 -> getTeacherById();
                case 3 -> getAllTeachers();
                case 4 -> {return;}
                default -> System.out.println("Invalid option");
            }
        }
    }

    private Teacher createTeacher(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student surname: ");
        String surname = scanner.nextLine();
        Teacher t = controller.createTeacher(name, surname);
        System.out.println(t);
        return t;
    }

    public Teacher getTeacherById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id: ");
        int id = scanner.nextInt();
        Teacher t = controller.getTeacherById(id);
        System.out.println(t);
        return t;
    }

    public List<Teacher> getAllTeachers(){
        List<Teacher> tList = controller.getAllTeachers();
        System.out.println(tList);
        return tList;
    }
}
