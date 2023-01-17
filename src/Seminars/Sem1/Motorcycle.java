package Seminars.Sem1;

public class Motorcycle extends Transport {
    public Motorcycle(String color, String type, String model, int wheels, int weight, int speed) {
        super(color, type, model, wheels, weight, speed);
    }

    @Override
    public void drive() {
        System.out.printf("The car %s is going now\n", this.getModel());
    }
}
