package HomeWorks.HW1;

/**
 * 11. Подгузники, содержащие следующее свойства:
 * 11.1 Размер
 * 11.2 Минимальный вес
 * 11.3 Максимальный вес
 * 11.4 Тип
 */
public class Diapers extends BaseProduct{
    public Diapers(String name, Integer cost, Integer amount, String item, Character size, Integer minWeight, Integer maxWeight,
                   String type) {
        super(name, cost, amount, item);
    }
}
