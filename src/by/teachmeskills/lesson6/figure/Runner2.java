package by.teachmeskills.lesson6.figure;

/**
 * @author Dzmitry Fursevich
 */
public class Runner2 {
    public static void main(String[] args) {
        Rectangle r0 = new Rectangle(1, 1, 5, 6);
        Figure f0 = r0;
        Figure f1 = new Circle(0, 0, 1);
        Rectangle r1 = r0;
        Rectangle r2 = (Rectangle) f0;

        int i = 10000;
        byte b = (byte) i;

        printInfo(f1);
    }

    public static void printInfo(Figure figure) {
        if (figure instanceof Rectangle) {
            Rectangle rect = (Rectangle) figure;
            System.out.println("rect.getWidth() = " + rect.getWidth());
        } else {
            System.out.println("circle");
        }
    }
}
