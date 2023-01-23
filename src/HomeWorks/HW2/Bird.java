package HomeWorks.HW2;

/**
 * Так же реализовать абстрактный класс "Птица", реализующий интерфейс животное, у которого будет защищённое поле:
 * 1.Высота полёта
 * и метод:
 * 2. Летать, выводящий на экран фразу "Я лечу на x метрах, где x - высота полёта
 * и защищённый конструктор:
 * 3.Конструктор принемающий высоту полёта
 */

public abstract class Bird implements Animal {
    private int flightAltitude;

    public int getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    void fly() {
        System.out.printf("Я лечу на %d метрах", this.getFlightAltitude());
    }
}
