package HomeWorks.HW1;

/**
 * А так же реализовать следующие классы-наследники:
 * 1. Продукты питания, содержащие следующие свойства:
 * 1.1 Срок годности
 */
public class Groceries extends BaseProduct{
    public Groceries(String name, Integer cost, Integer amount, String item, String expirationDate) {
        super(name, cost, amount, item);
    }
}
