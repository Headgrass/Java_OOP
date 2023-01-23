package HomeWorks.HW2;

/**
 * Реализовать классы следующих животных, реализующих интерфейсы домашнего животного или
 * дикого животного(надеюсь сами поймёте какое животное домашнее, а какое - дикое):
 * 2.1 Тигр
 */

public class Tiger implements WildAnimal {

    @Override
    public void makeSound() {
        System.out.println("RRrrRRRrRRrGhHHH");
    }

    @Override
    public void printInfo() {
        System.out.println("Я совсем дикий!");
    }
}
