package seminars.solid_principle.srp1;


import seminars.solid_principle.srp1.figure.Drawer;
import seminars.solid_principle.srp1.figure.Point;
import seminars.solid_principle.srp1.figure.Square;
import seminars.solid_principle.srp1.figure.SquareDrawer;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Square area: %d \n", square.getArea());
        Drawer squareDrawer = new SquareDrawer(square.getSide());
        squareDrawer.draw();
    }
}
