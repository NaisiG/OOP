package HomeWork02;

import HomeWork02.animal.Frog;
import HomeWork02.animal.Snake;
public class MainTwo {
    public static void main(String[] args) {
        Terrarium terrarium = new Terrarium();
        terrarium.addAnimal(new Frog("Квакающий")).addAnimal(new Snake("Шипящий"));

        System.out.println(terrarium);

        System.out.println("---звуки---");
        System.out.println(terrarium.getSounds());

        System.out.println("--Самый быстрый пловец--");
        System.out.println(terrarium.getFastestSwimmer());
    }
}
