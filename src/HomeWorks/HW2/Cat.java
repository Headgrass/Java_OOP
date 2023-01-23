package HomeWorks.HW2;

/**
 * Реализовать классы следующих животных, реализующих интерфейсы домашнего животного или
 * дикого животного(надеюсь сами поймёте какое животное домашнее, а какое - дикое):
 * 1.Кот со свойством:
 * 1.1 Наличие шерсти(доступным только для чтения внешним классам)
 */

public class Cat implements HomeAnimal {

    private Boolean wool;

    @Override
    public void makeSound() {
        System.out.println("Мяу");
    }

    @Override
    public void printInfo() {
        System.out.println("Я домашний кот");
    }

    @Override
    public void beKind() {
        System.out.println(" добрый");
    }

    public Boolean getWool() {
        return wool;
    }
}
