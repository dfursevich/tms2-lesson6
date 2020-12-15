package by.teachmeskills.lesson6.figure;

/**
 * @author Dzmitry Fursevich
 */
public abstract class Figure {
    private int x;
    private int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract double getArea();
}
