package by.teachmeskills.lesson6.figure;

/**
 * @author Dzmitry Fursevich
 */
public class Runner {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(0, 0, 10, 20);
        Circle c = new Circle(0, 0, 30);

        System.out.println("c.getX() = " + c.getX());

        System.out.println("r.getArea() = " + r.getArea());
        System.out.println("c.getArea() = " + c.getArea());

        printInfo(r);
        printInfo(c);
        printInfo(new Diamond(0, 0, 10));
    }

    public static void printInfo(Figure figure) {
        System.out.println("figure.getX() = " + figure.getX());
        System.out.println("figure.getY() = " + figure.getY());
        System.out.println("figure.getArea() = " + figure.getArea());
    }
}
