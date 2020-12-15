package by.teachmeskills.lesson6;

/**
 * @author Dzmitry Fursevich
 */
public class Accountant extends Employee {
    private boolean head;

    public Accountant(String name, int age, String phone, String company, boolean head) {
        super(name, age, phone, company);
        this.head = head;
    }

    public boolean isHead() {
        return head;
    }

    public void setHead(boolean head) {
        this.head = head;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("head = " + head);
    }
}
