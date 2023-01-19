package HomeWorks.HW1;

/**
 * 7. Хлеб, содержащий следующие свойство:
 * 7.1 Тип муки
 */
public class Flour extends Cat_Groceries{

    public String type;

    public Flour(String name, Integer cost, Integer amount, String item, String expirationDate, String type) {
        super(name, cost, amount, item, expirationDate);
        this.type = type;
    }

    @Override
    public String toString() {
        return
                System.out.printf("Название товара: %s, Цена: %d, Количество в упаковке: %d, Еденица измерения: %s, " +
                                "Срок годности: %s, Тип муки: %s", this.getName(), this.getCost(),
                        this.getAmount(), this.getItem(), expirationDate, type).toString();
    }

    public void setType(String type) {
        this.type = type;
    }
}
