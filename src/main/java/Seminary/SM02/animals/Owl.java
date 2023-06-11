package Seminary.SM02.animals;

import Seminary.SM02.FlySpeed;
import Seminary.SM02.RunSpeed;
import Seminary.SM02.animals.base.Bird;
public class Owl extends Bird implements FlySpeed, RunSpeed {
    public Owl(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Ух-Уух";
    }

    @Override
    public String feed() {
        return "мышки, грызуны";
    }

    @Override
    public int getFlySpeed() {
        return 90;
    }

    @Override
    public int getRunSpeed() {
        return 2;
    }
}
