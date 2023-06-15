package HomeWork06.HomeWork.src;

public abstract class UserAbstract {
    protected String name;

    public UserAbstract(String name) {
        this.name = name;
    }

    public abstract String getName();
}
