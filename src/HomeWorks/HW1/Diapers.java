package HomeWorks.HW1;

/**
 * 11. Подгузники, содержащие следующее свойства:
 * 11.1 Размер
 * 11.2 Минимальный вес
 * 11.3 Максимальный вес
 * 11.4 Тип
 */
public class Diapers extends Hygiene{
    private Character size;
    private int minWeight;
    private int maxWeight;
    private String type;
    public Diapers(String name, Integer cost, Integer amount, String item, Integer amountInPack, Character size, Integer minWeight, Integer maxWeight,
                   String type) {
        super(name, cost, amount, item, amountInPack);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return
                System.out.printf("Название товара: %s, Цена: %d, Количество в упаковке: %d, Еденица измерения: %s," +
                        "Размер: %c, Минимальный вес: %d, Максимальный вес: %d, Тип: %s", this.getName(), this.getCost(),
                        this.getAmount(), this.getItem(), this.size, this.minWeight, this.maxWeight, type).toString();
    }
}
