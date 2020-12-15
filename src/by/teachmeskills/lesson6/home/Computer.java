package by.teachmeskills.lesson6.home;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Dzmitry Fursevich
 */
public class Computer {
    private int cpu;
    private int hdd;
    private int ram;
    private int resource;
    private boolean on;

    public Computer(int cpu, int hdd, int ram, int resource) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.resource = resource;
    }

    public void printInfo() {
        System.out.println("cpu = " + cpu);
        System.out.println("hdd = " + hdd);
        System.out.println("ram = " + ram);
    }

    public void turnOn() {
        if (!on) {
            if (resource > 0) {
                if (!failure()) {
                    resource = resource - 1;
                    on = true;
                    System.out.println("Компьтер включился");
                } else {
                    resource = 0;
                    System.out.println("Компьютер сгорел");
                }
            } else {
                System.out.println("Компьютер сгорел");
            }
        } else {
            System.out.println("Компьютер уже включен");
        }
    }

    public void turnOff() {
        if (on) {
            if (resource > 0) {
                if (!failure()) {
                    resource = resource - 1;
                    on = false;
                    System.out.println("Компьтер выключится");
                } else {
                    resource = 0;
                    System.out.println("Компьютер сгорел");
                }
            } else {
                System.out.println("Компьютер сгорел");
            }
        } else {
            System.out.println("Комьютер уже выключен");
        }
    }

    public boolean isDamaged() {
        return resource == 0;
    }

    private boolean failure() {
        Random rnd = new Random();
        int guess = rnd.nextInt(11);
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number from 0 to 10: ");
        int input = sc.nextInt();
        return input == guess;
    }

//    private boolean failure() {
//        return false;
//    }
}
