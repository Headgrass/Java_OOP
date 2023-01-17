package HomeWorks.HW1;

/**
 * 2. Напитки, содержащие следующие свойства:
 * 2.1 Объём
 */
public class Drinks extends Groceries{
    private double volume;
    public Drinks(String name, Integer cost, Integer amount, String item, String expirationDate, double volume) {
        super(name, cost, amount, item, expirationDate);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return
                System.out.printf("Название товара: %s, Цена: %d, Количество в упаковке: %d, Еденица измерения: %s, " +
                                "Объем: %s", this.getName(), this.getCost(),
                        this.getAmount(), this.getItem(), this.volume).toString();
    }
}
