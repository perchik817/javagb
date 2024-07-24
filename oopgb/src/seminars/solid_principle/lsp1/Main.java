package seminars.solid_principle.lsp1;

import seminars.solid_principle.lsp1.shape.Quadrilateral;
import seminars.solid_principle.lsp1.shape.Rectangle;
import seminars.solid_principle.lsp1.shape.Square;
import seminars.solid_principle.lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Quadrilateral square = new Square(5);
        System.out.printf("square's area is: %.2f\n", square.getArea());
        ShapeView view = new ShapeView(square);
        view.showArea();
    }
}
