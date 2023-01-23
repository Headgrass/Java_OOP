package HomeWorks.HW2;

/**
 * На языке Java реализовать интерфейс "Животное" со следующими полями:
 * 1.Рост животного
 * 2.Вес животного
 * 3.Цвет глаз животного
 * И методы:
 * 1.Издать звук
 * 2.Напечатать информацию о животном
 */

public interface Animal {
    double height = 0;
    int weight = 0;
    String colorEye = "";

    void makeSound();
    void printInfo();
}
