package HomeWorks.HW2;

/**
 * 4.Волк со свойством:
 * 4.1 Вожак стаи(доступным только для чтения внешним классам)
 */

public class Wolf implements WildAnimal {

    private Boolean leader;

    public Boolean getLeader() {
        return leader;
    }

    @Override
    public void makeSound() {
        System.out.println("Wowwwwwwwwwwwwwwww");
    }

    @Override
    public void printInfo() {
        System.out.println("Это животное без имени");
    }
}
