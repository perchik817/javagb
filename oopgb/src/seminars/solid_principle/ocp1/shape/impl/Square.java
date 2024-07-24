package seminars.solid_principle.ocp1.shape.impl;

import ocp1.shape.Shape;
import seminars.solid_principle.ocp1.shape.Shape;

public class Square  implements Shape {
    private final int side;
    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
