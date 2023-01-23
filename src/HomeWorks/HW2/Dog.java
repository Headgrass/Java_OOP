package HomeWorks.HW2;

/**
 * 3.Собака со свойством:
 * 3.1 Наличие дрессировки(доступным только для чтения внешним классам)
 * и методом:
 * 3.2 Дрессировать
 */

public class Dog implements HomeAnimal {

    private Boolean training;

    @Override
    public void makeSound() {
        System.out.println("Wow Wow");
    }

    @Override
    public void printInfo() {
        System.out.println("Я собака");
    }

    @Override
    public void beKind() {
        System.out.println(" дружелюбная");
    }

    public Boolean getTraining() {
        return training;
    }
}
