package seminars.solid_principle.homework.model;

public class Saver {
    private final User user;

    public Saver(User user){
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    // I move it to SaverService - s principe of solid
//    public void save(){
//        System.out.println("Save user: " + user.getName());
//    }
}
