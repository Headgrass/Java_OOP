package HomeWorks.HW1;

/**
 * Реализовать класс товар, содержащий следующие свойства:
 * 1. Название
 * 2. Цена
 * 3. Количество
 * 4. Единица измерения
 */
public class BaseProduct {
    private String name;
    private Integer cost;
    private Integer amount;
    private String item;


    public BaseProduct(String name, Integer cost, Integer amount, String item) {
        this.name = name;
        this.cost = cost;
        this.amount = amount;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public Integer getCost() {
        return cost;
    }

    public Integer getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }
}
