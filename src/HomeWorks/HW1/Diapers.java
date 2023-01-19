package HomeWorks.HW1;

/**
 * 11. Подгузники, содержащие следующее свойства:
 * 11.1 Размер
 * 11.2 Минимальный вес
 * 11.3 Максимальный вес
 * 11.4 Тип
 */
public class Diapers extends Cat_Kids {
    private Character size;
    private int minWeight;
    private int maxWeight;
    private String type;

    public Diapers(String name, Integer cost, Integer amount, String item, Integer minimumAge, Boolean hypoallergenic,
                   Character size, int minWeight, int maxWeight, String type) {
        super(name, cost, amount, item, minimumAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return System.out.printf("Название товара: %s, Цена: %d, Количество в упаковке: %d, Еденица измерения: %s, " +
                        "Размер: %c, Минимальный вес: %d, Максимальный вес: %d, Тип: %s", this.getName(), this.getCost(),
                        this.getAmount(), this.getItem(), this.size, this.minWeight, this.maxWeight, type).toString();
    }

    public void setSize(Character size) {
        this.size = size;
    }

    public void setMinWeight(int minWeight) {
        this.minWeight = minWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setType(String type) {
        this.type = type;
    }
}
