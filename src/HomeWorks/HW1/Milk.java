package HomeWorks.HW1;

/**
 * 5. Молоко, содержащиее следующее свойство:
 * 5.1 Процент жирности
 * 5.2 Срок годности
 */
public class Milk extends Cat_Drinks {

    private Double fat;
    public String expirationDate;

    public Milk(String name, Integer cost, Integer amount, String item, Double volume, Double fat, String expirationDate) {
        super(name, cost, amount, item, volume);
        this.fat = fat;
        this.expirationDate = expirationDate;
    }


    @Override
    public String toString() {
        return System.out.printf("Название товара: %s, Цена: %d, Количество в упаковке: %d, Еденица измерения: %s," +
                                "Объем: %f, Процент жирности: %f, Срок годности: %s", this.getName(), this.getCost(),
                        this.getAmount(), this.getItem(), this.getVolume(), this.fat, this.expirationDate).toString();
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
