package HomeWork02.animal;

import HomeWork02.Soundable;
import HomeWork02.SwimSpeed;
import HomeWork02.animal.base.Amphibian;

public class Frog extends Amphibian implements SwimSpeed, Soundable {
    public Frog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Ква-ква";
    }

    @Override
    public String feed() {
        return "Мелкими насекомыми";
    }

    @Override
    public int getSwimSpeed() {
        return 3;
    }

    @Override
    public String toString() {
        return String.format("Лягушка: %s, Кормить: %s, Скорость плавания: %d", super.toString(), feed(), getSwimSpeed());
    }
}
