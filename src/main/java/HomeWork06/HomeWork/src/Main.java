package HomeWork06.HomeWork.src;

import HomeWork06.HomeWork.src.report.Reporter;
import HomeWork06.HomeWork.src.save.Persister;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        new Reporter(user).report();
        new Persister(user).save();
    }
}
