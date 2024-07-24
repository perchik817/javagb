package seminars.solid_principle.srp1.figure;

public class SquareDrawer implements Drawer{

    public int side;

    public SquareDrawer(int side) {
        this.side = side;
    }

    public void draw() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < side; i++) {
            builder.append("* ");
        }
        System.out.println(builder);
        for (int i = 0; i < side; i++) {
            if (i < side - 2) {
                System.out.print("*");
            } else {
                continue;
            }

            for (int j = 1; j < side - 1; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }

        System.out.println(builder);
    }
}
