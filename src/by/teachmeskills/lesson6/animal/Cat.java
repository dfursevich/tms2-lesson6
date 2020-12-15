package by.teachmeskills.lesson6.animal;

/**
 * @author Dzmitry Fursevich
 */
public class Cat extends Animal {
    private boolean catchMice;
    private String instagram;

    public Cat(String name, int age, boolean catchMice, String instagram) {
        super(name, age);
        this.catchMice = catchMice;
        this.instagram = instagram;
    }

    public boolean isCatchMice() {
        return catchMice;
    }

    public String getInstagram() {
        return instagram;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("catchMice = " + catchMice);
        System.out.println("instagram = " + instagram);
    }

    public void greet() {
        System.out.println("Meow");
    }
}
