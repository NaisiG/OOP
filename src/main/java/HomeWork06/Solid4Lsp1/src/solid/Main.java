package HomeWork06.Solid4Lsp1.src.solid;

import HomeWork06.Solid4Lsp1.src.solid.lsp.Rectangle;
import HomeWork06.Solid4Lsp1.src.solid.lsp.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square(5);
        rectangle.setSideA(4);
        rectangle.setSideB(5);
        System.out.printf("В прямоугольнике сторона A = %d, сторона B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ViewShape view = new ViewShape(rectangle);
        view.showArea();
    }
}
