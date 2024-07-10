package seminars.lesson005.com.ex.demo.service;

import seminars.lesson005.com.ex.demo.model.User;

public interface UserService<T extends User> {
    <T extends User> T createUser();
}
