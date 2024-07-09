package seminars.lesson004.view;

import seminars.lesson004.models.User;

import java.util.List;

public interface UserView<T extends User>{
    /*
    * this is a backend's substitution of frontend's interface
    * responsible for connection with user
    * gets data from user -> gives to controller -> controller calls service's methods -> service works with data and
    * returns to controller -> controller receives handled data and passes them to view/front
    * */

    void sendOnConsole(List<T> users);
}
