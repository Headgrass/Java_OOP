package HomeWorks.HW2;

/**
 * И следующие классы-наследники:
 * 2.Аист
 */

public class Stork extends Bird {
    @Override
    public void makeSound() {
        System.out.println("IoIoIo");
    }

    @Override
    public void printInfo() {
        System.out.println("инфо о аисте");
    }
}
