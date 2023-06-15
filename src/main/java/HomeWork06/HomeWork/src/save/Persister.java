package HomeWork06.HomeWork.src.save;

import HomeWork06.HomeWork.src.UserAbstract;

public class Persister implements Saveable {
    private UserAbstract userAbstract;

    public Persister(UserAbstract userAbstract) {
        this.userAbstract = userAbstract;
    }

    public void save() {
        System.out.println("Save user: " + userAbstract.getName());
    }
}
