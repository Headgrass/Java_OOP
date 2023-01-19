package HomeWorks.HW1;

/**
 * 2. Напитки, содержащие следующие свойства:
 * 2.1 Объём
 */
public class Cat_Drinks extends BaseProduct{
    private double volume;

    public Cat_Drinks(String name, Integer cost, Integer amount, String item, Double volume) {
        super(name, cost, amount, item);
        this.volume = volume;
    }


    @Override
    public String toString() {
        return
                System.out.printf("Название напитка: %s, Цена: %d, Количество в упаковке: %d, Еденица измерения: %s, " +
                                "Объем: %s", this.getName(), this.getCost(),
                        this.getAmount(), this.getItem(), this.volume).toString();
    }

    public double getVolume() {
        return volume;
    }
}
