package seminars.solid_principle.homework;

public class Saver {
    private final User user;

    public Saver(User user){
        this.user = user;
    }

    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
