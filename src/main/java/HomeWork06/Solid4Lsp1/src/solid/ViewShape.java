package HomeWork06.Solid4Lsp1.src.solid;

import HomeWork06.Solid4Lsp1.src.solid.lsp.Rectangle;

public class ViewShape {
    private Rectangle rectangle;

    public ViewShape(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {
        System.out.print("Площадь прямоугольника равна:");
        System.out.println(rectangle.getArea());
    }
}

