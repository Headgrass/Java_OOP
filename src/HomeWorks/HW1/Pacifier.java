package HomeWorks.HW1;

/**
 * 12. Соска
 */
public class Pacifier extends Cat_Kids{

    public Pacifier(String name, Integer cost, Integer amount, String item, Integer minimumAge, Boolean hypoallergenic) {
        super(name, cost, amount, item, minimumAge, hypoallergenic);
    }

    @Override
    public String toString() {
        return System.out.printf("Название товара: %s, Цена: %d, Количество в упаковке: %d, Еденица измерения: %s," +
                        "Минимальный возраст: $d, Гипоаллергенный: %b", this.getName(), this.getCost(),
                this.getAmount(), this.getItem(), this.getMinmumAge(), this.getHypoallergenic()).toString();
    }
}
