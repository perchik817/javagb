package seminars.solid_principle.homework.controller;

import seminars.solid_principle.homework.model.User;
import seminars.solid_principle.homework.service.UserService;

public class UserController {

    private final UserService userService = new UserService();

    public User createUser(String name) {
        return userService.createUser(name);
    }

    public void report(User user){
        userService.report(user);
    }

    public void saveUser(User user){
        userService.save(user);
    }
}
