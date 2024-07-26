package seminars.solid_principle.homework.service;

import seminars.solid_principle.homework.model.Saver;
import seminars.solid_principle.homework.model.User;

public class SaverService {

    private Saver saver;

    public Saver createSaver(User user){
        this.saver = new Saver(user);
        return saver;
    }

    public void save(){
        System.out.println("Save user: " + this.saver.getUser().getName());
    }
}
