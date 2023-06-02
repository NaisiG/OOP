package HomeWork02.animal.base;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Название: %s", name);
    }

    public abstract String makeSound();

    public abstract String feed();
}
