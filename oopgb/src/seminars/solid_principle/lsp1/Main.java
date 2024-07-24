package seminars.solid_principle.lsp1;

import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square(5);
        rectangle.setSideA(4);
        rectangle.setSideB(5);
        System.out.printf("In a rectangle side A = %d, side B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ShapeView view = new ShapeView(rectangle);
        view.showArea();
    }
}
