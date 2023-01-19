package HomeWorks.HW1;

/**
 * 9. Маски
 */
public class Masks extends Cat_Hygiene{

    public Masks(String name, Integer cost, Integer amount, String item, Integer amountInPack) {
        super(name, cost, amount, item, amountInPack);
    }

    @Override
    public String toString() {
        return System.out.printf("Название товара: %s, Цена: %d, Количество в упаковке: %d, Еденица измерения: %s,"
                        , this.getName(), this.getCost(),
                this.getAmount(), this.getItem()).toString();
    }
}
