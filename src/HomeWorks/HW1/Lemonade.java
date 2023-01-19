package HomeWorks.HW1;

/**
 * 6. Лимонад
 */
public class Lemonade extends Cat_Groceries{
    public Lemonade(String name, Integer cost, Integer amount, String item, String expirationDate) {
        super(name, cost, amount, item, expirationDate);
    }

    @Override
    public String toString() {
        return System.out.printf("Название товара: %s, Цена: %d, Количество в упаковке: %d, Еденица измерения: %s," +
                        "Срок годности: %s", this.getName(), this.getCost(),
                this.getAmount(), this.getItem(), this.expirationDate).toString();
    }
}
