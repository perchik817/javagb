package seminars.lesson005.com.ex.demo.view;

import seminars.lesson005.com.ex.demo.controller.MainController;

import java.util.Scanner;

public class MainView {

    private MainController controller = new MainController(
            new StudentView(),
            new TeacherView(),
            new StudyGroupView());

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("------MAIN MENU------" +
                    "\n1. Work with students" +
                    "\n2. Work with teachers" +
                    "\n3. Work with study groups" +
                    "\n4. Exit");
            switch (scanner.nextInt()) {
                case 1 -> controller.getStudentView().start();
                case 2 -> controller.getTeacherView().start();
                case 3 -> controller.getStudyGroupView().start();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid option");
            }
        }
    }
}
