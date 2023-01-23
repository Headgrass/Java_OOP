package HomeWorks.HW2;

/**
 * Так же реализовать следующие интерфейсы, реализующие интерфейс Животное:
 * 1.Домашнее животное со следующими свойствами:
 * 1.1 Кличка
 * 1.2 Порода
 * 1.3 Наличие прививок
 * 1.4 Цвет шерсти
 * 1.5 Дата рождения
 * И методами:
 * 1.5 Проявлять ласку
 */

public interface HomeAnimal extends Animal {
    String name = "";
    String breed = "";
    String vaccinations = "";
    String coatColor = "";
    String dateOfBirth = "";

    void beKind();
}
