package Seminars.Sem1;

public class Transport {
    private String color;
    private String type;
    private String model;
    private int wheels;
    private int weight;
    private int speed;

    public Transport(String color, String type, String model, int wheels, int weight, int speed) {
        this.color = color;
        this.type = type;
        this.model = model;
        this.wheels = wheels;
        this.weight = weight;
        this.speed = speed;
    }

    public String getType() {
        return this.type;
    }

    public void drive() {
        if(this.type == null) {
            System.out.println("Need to implement drive method");
        } else {
            System.out.printf("The %s %s is going now\n", this.getType(), this.getModel());
        }
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getWheels() {
        return wheels;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return String.format("Type: %s, Model: %s, Color: %s, Wheels: %d, Weight: %d, Speed: %d",
                this.getType(), this.getModel(), this.getColor(), this.getWheels(), this.getWeight(), this.getSpeed());
    }
}
