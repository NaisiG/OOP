package HomeWork06.HomeWork.src;

public class User extends UserAbstract{

    public User(String name) {
        super(name);
    }

    public String getName(){
        return super.name;
    }
}