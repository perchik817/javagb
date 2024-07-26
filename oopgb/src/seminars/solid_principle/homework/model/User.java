package seminars.solid_principle.homework.model;

public class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // I move it to SaverService because of first principle of solid
//    public void save(){
//        Saver saver = new Saver(this);
//        saver.save();
//    }

//    public void report(){
//        System.out.println("Report for user: " + name);
//    }
}
