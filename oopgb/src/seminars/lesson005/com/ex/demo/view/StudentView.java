package seminars.lesson005.com.ex.demo.view;

import seminars.lesson005.com.ex.demo.controller.StudentController;
import seminars.lesson005.com.ex.demo.db.Database;
import seminars.lesson005.com.ex.demo.model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private StudentController controller = new StudentController();

    public void start(){
        Scanner scanner = new Scanner(System.in);
//        Database.fillDb();
        while(true){
            System.out.println("------WORK WITH STUDENTS------" +
                    "\n1. Create student" +
                    "\n2. Get student by id" +
                    "\n3. Get all students" +
                    "\n4. Go back to the main view");
            switch (scanner.nextInt()){
                case 1 -> createStudent();
                case 2 -> getStudentById();
                case 3 -> getAllStudents();
                case 4 -> {return;}
                default -> System.out.println("Invalid option");
            }
        }
    }

    private Student createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student surname: ");
        String surname = scanner.nextLine();
//        System.out.println("Enter student group number: ");
//        int groupId = scanner.nextInt();
        Student s = controller.createStudent(name, surname);
        System.out.println(s);
        return s;
    }

    public Student getStudentById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student id: ");
        int id = scanner.nextInt();
        Student s = controller.getStudentById(id);
        System.out.println(s);
        return s;
    }

    public List<Student> getAllStudents(){
        List<Student> sList = controller.getAllStudents();
        System.out.println(sList);
        return sList;
    }
}
