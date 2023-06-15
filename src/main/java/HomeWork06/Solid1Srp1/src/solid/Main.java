package HomeWork06.Solid1Srp1.src.solid;

import HomeWork06.Solid1Srp1.src.solid.srp.Point;
import HomeWork06.Solid1Srp1.src.solid.srp.Square;
import HomeWork06.Solid1Srp1.src.solid.srp.SquareDraw;

public class Main {
    public static void main(String[] args) {
        int side = 5;
        Square square = new Square(new Point(1,1), side);
        SquareDraw squareDraw = new SquareDraw(side);
        squareDraw.draw();
        System.out.printf("Площадь фигуры: %d \n", square.getArea());

        squareDraw.setSide(square.getSide() * 2);
        squareDraw.draw();
        System.out.printf("Площадь фигуры: %d \n", square.getArea());

    }
}
