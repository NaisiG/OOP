package HomeWork02.animal.base;

public abstract class Reptile extends Animal {

    public Reptile(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return String.format("Рептилия: %s", super.toString());
    }
}
