package seminars.solid_principle.homework.view;

import seminars.solid_principle.homework.controller.UserController;
import seminars.solid_principle.homework.model.User;
import seminars.solid_principle.homework.service.SaverService;

import java.util.Scanner;

public class UserView {
    private final UserController controller = new UserController();

    public void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        User u1 = controller.createUser(userName);
        controller.report(u1);
        controller.saveUser(u1);
        System.out.println("Good bye!");
    }
}
