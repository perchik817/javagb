package seminars.solid_principle.homework.service;

import seminars.solid_principle.homework.model.User;

public class UserService {

    public User createUser(String name) {
        return new User(name);
    }

    public void report(User user){
        System.out.println("Report for user: " + user.getName());
    }

    public void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}
