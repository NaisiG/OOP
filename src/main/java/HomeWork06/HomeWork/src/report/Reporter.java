package HomeWork06.HomeWork.src.report;

import HomeWork06.HomeWork.src.UserAbstract;

public class Reporter implements Reportable {
    private UserAbstract userAbstract;

    public Reporter(UserAbstract userAbstract) {
        this.userAbstract = userAbstract;
    }

    public void report(){
        System.out.println("Report for user: " + userAbstract.getName());
    }
}
