package HomeWorks.HW1;

/**
 * 3. Предметы гигиены, содержащие следующие свойства:
 * 3.1 Количество штук в упаковке
 */
public class Cat_Hygiene extends BaseProduct{

    public int amountInPack;

    public Cat_Hygiene(String name, Integer cost, Integer amount, String item, Integer amountInPack) {
        super(name, cost, amount, item);
        this.amountInPack = amountInPack;
    }

    @Override
    public String toString() {
        return System.out.printf("Название товара: %s, Цена: %d, Количество в упаковке: %d, Еденица измерения: %s, " +
                                "Количество штук в упаковке: %d", this.getName(), this.getCost(),
                        this.getAmount(), this.getItem(), amountInPack).toString();
    }
}
