package by.teachmeskills.lesson6.figure;

/**
 * @author Dzmitry Fursevich
 */
public class Circle extends Figure {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius;
    }
}
