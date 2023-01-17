package Seminars.Sem1;

/**
 * На языке Java реализовать следующий набор классов, при этом должна быть выделена их иерархия:
 * 2.1.Транспортное средство
 * 2.2.Автомобиль
 * 2.3.Мотоцикл
 * 2.4.Грузовик
 * 2.5.Велосипед
 * Во всех классах должны быть написаны: цвет, модель, количество колёс, вес и скорость а так же метод ехать.
 * В классе Program реализовать метод который будет работать с любым наследником класса ровно так же как
 * и с родителем, то есть показать значение всех его публичных свойств и вызвать метод ехать.
 */
public class Program {
    private static void showTransport(Transport[] all) {
        for (Transport transport: all) {
            System.out.println(transport);
            transport.drive();
            System.out.println("------------");
        }
    }
    public static void main(String[] args) {
        Transport baseTransport = new Transport("Gray", "Transport", "null",4, 1000, 120);
        Transport car = new Car("Red", "car", "BMW",4, 1500, 280);
        Transport truck = new Truck("Blue", "truck", "Scania",10, 15000, 130);
        Transport motorcycle = new Motorcycle("Purple", "motorcycle", "Suzuki", 2, 250, 180);
        Transport bike = new Bike("Red", "bike", "Kross", 2, 15, 60);

        Transport[] all = new Transport[] {baseTransport, car, truck, motorcycle, bike};
        showTransport(all);

    }
}
