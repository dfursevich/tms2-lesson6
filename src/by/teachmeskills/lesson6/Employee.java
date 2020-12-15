package by.teachmeskills.lesson6;

/**
 * @author Dzmitry Fursevich
 */
public class Employee extends Person {
    private String company;

    public Employee(String name, int age, String phone, String company) {
        super(name, age, phone);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("company = " + company);
    }

    public void printCompanyAndName() {
        System.out.println("company = " + company);
        System.out.println("name = " + getName());
    }
}
