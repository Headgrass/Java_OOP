package HomeWorks.HW1;

/**
 * 5. Молоко, содержащиее следующее свойство:
 * 5.1 Процент жирности
 * 5.2 Срок годности
 */
public class Milk extends Groceries{

    private Double fat;
    public Milk(String name, Integer cost, Integer amount, String item, String expirationDate, Double fat) {
        super(name, cost, amount, item, expirationDate);
        this.fat = fat;
    }
}
