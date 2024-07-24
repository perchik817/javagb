package seminars.solid_principle.ocp1;

import seminars.solid_principle.ocp1.shape.*;
import seminars.solid_principle.ocp1.shape.impl.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }

        System.out.printf("Sum of areas equals %f \n", sumArea);
    }
}
