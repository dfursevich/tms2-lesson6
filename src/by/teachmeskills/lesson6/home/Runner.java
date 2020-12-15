package by.teachmeskills.lesson6.home;

/**
 * @author Dzmitry Fursevich
 */
public class Runner {
    public static void main(String[] args) {
        Computer comp = new Computer(2400, 1000, 16, 10);
        comp.printInfo();

//        comp.turnOn();
//
//        System.out.println("comp.isDamaged() = " + comp.isDamaged());

        while (!comp.isDamaged()) {
            comp.turnOn();
            comp.turnOn();
            comp.turnOff();
        }
    }
}
