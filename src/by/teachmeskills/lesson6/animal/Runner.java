package by.teachmeskills.lesson6.animal;

/**
 * @author Dzmitry Fursevich
 */
public class Runner {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom", 10, true, "http://instagram.com");
        tom.setAge(4);

        tom.printInfo();
        tom.greet();

        System.out.println("tom.getInstagram() = " + tom.getInstagram());
    }
}
