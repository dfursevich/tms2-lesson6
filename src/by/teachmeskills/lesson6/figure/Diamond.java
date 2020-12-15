package by.teachmeskills.lesson6.figure;

/**
 * @author Dzmitry Fursevich
 */
public class Diamond extends Figure {
    private int side;

    public Diamond(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
