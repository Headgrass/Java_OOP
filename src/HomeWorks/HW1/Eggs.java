package HomeWorks.HW1;

/**
 * 8. Яйца, содержащее следующиее свойство:
 * 8.1 Количество в упаковке
 */
public class Eggs extends Cat_Groceries{

    public Eggs(String name, Integer cost, Integer amount, String item, String expirationDate) {
        super(name, cost, amount, item, expirationDate);
    }

    @Override
    public String toString() {
        return
                System.out.printf("Название товара: %s, Цена: %d, Количество в упаковке: %d, Еденица измерения: %s, " +
                                "Срок годности: %s", this.getName(), this.getCost(),
                        this.getAmount(), this.getItem(), expirationDate).toString();
    }


}
