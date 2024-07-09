package seminars.lesson004.controllers;

import seminars.lesson004.models.User;

public interface UserController {
    //parametrized method returns obj User
    <T extends User> User create(T user);

}
