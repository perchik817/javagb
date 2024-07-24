package seminars.solid_principle.lsp1.view;

import seminars.solid_principle.lsp1.shape.Quadrilateral;

public class ShapeView {
    private final Quadrilateral quadrilateral;

    public ShapeView(Quadrilateral quadrilateral) {
        this.quadrilateral = quadrilateral;
    }

    public void showArea() {
        System.out.print("Area of quadrilateral equals:");
        System.out.println(quadrilateral.getArea());
    }
}
