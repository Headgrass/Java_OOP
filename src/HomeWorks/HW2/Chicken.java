package HomeWorks.HW2;

/**
 * И следующие классы-наследники:
 * 1.Курица
 */

public class Chicken extends Bird {
    @Override
    public void makeSound() {
        System.out.println("Ко-ко-ко");
    }

    @Override
    public void printInfo() {
        System.out.println("инфа о курице");
    }
}
