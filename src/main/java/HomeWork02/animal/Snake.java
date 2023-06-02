package HomeWork02.animal;

import HomeWork02.Soundable;
import HomeWork02.SwimSpeed;
import HomeWork02.animal.base.Reptile;

public class Snake extends Reptile implements SwimSpeed, Soundable {
    public Snake(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Ш-ш-ш-ш-ш-ш";
    }

    @Override
    public String feed() {
        return "Мелкими грызунами";
    }

    @Override
    public String toString() {
        return String.format("Змея: %s, Кормить: %s, Скорость плавания: %d", super.toString(), feed(), getSwimSpeed());
    }

    @Override
    public int getSwimSpeed() {
        return 2;
    }
}
