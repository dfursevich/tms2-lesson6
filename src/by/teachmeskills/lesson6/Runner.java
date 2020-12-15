package by.teachmeskills.lesson6;

/**
 * @author Dzmitry Fursevich
 */
public class Runner {
    public static void main(String[] args) {
        Person p = new Person("Sam", 10, "+375222222");

        Employee em = new Employee("Sam", 10, "37544444", "Samsung");

        em.printInfo();

        Accountant ac = new Accountant("Ann", 20, "+3752222", "Oracle", true);
        ac.printInfo();

        System.out.println("-----------------");
        Person tom = new Employee("Tom", 30, "+37544444", "Apple");
        tom.printInfo();
    }
}
