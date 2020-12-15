package by.teachmeskills.lesson6.animal;

/**
 * @author Dzmitry Fursevich
 */
public class Dog extends Animal {
    private int commands;

    public Dog(String name, int age, int commands) {
        super(name, age);
        this.commands = commands;
    }

    public int getCommands() {
        return commands;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("commands = " + commands);
    }

    @Override
    public void greet() {
        System.out.println("Woof");
    }
}
