package Seminary.SM04;

import Seminary.SM04.warriors.Archer;
import Seminary.SM04.warriors.Infantryman;
import Seminary.SM04.warriors.Warrior;
import Seminary.SM04.weapons.meleeWeapon.Axe;
import Seminary.SM04.weapons.meleeWeapon.Sword;
import Seminary.SM04.weapons.rangedWeapon.Bow;
import Seminary.SM04.weapons.rangedWeapon.CrossBow;

public class MainClassForSeminarFour {
    public static void main(String[] args) {
        Team<Warrior> team1 = new Team<>();
        team1.add(new Archer("Robin", 100, new Bow()));
        team1.add(new Infantryman("John", 150,new Axe()));

        Team<Archer> teamArchers = new Team<>();
        teamArchers.add(new Archer("Jimmy", 100, new CrossBow()));
        teamArchers.add(new Archer("Piter",100, new Bow()));

        Team<Infantryman> teamInfantryman = new Team<>();
        teamInfantryman.add(new Infantryman("James", 150, new Sword()));

        System.out.println(team1);
        System.out.println("-----------");
        System.out.println(teamArchers);
        System.out.println("-----------");
        System.out.println(teamInfantryman);


        Battle battle1 = new Battle(new Infantryman("John", 150,new Axe()), (new Archer("Robin", 100, new Bow())));

        battle1.fight();

    }
}
