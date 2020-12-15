package by.teachmeskills.lesson6.figure;

/**
 * @author Dzmitry Fursevich
 */
public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
