package seminars.solid_principle.homework;

import seminars.solid_principle.homework.view.UserView;

public class Main{
    public static void main(String[] args){
//        User user = new User("Bob");
//        user.report();
//        user.save();
        new UserView().start();
    }
}