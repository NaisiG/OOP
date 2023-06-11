package Seminary.SM04.warriors;

import Seminary.SM04.weapons.meleeWeapon.Melee;

public class Infantryman extends Warrior<Melee>{

    public Infantryman(String name, int healthPoint, Melee weapon) {
        super(name, healthPoint, weapon);
    }

    @Override
    public String toString() {
        return String.format("Infantryman: %s", super.toString());
    }
}
