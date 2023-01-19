package HomeWorks.HW1;

import java.io.PrintStream;

/**
 * 4. Детские товары:
 * 4.1 Минимальный возраст
 * 4.2 Гипоаллергенность
 */
public class Cat_Kids extends BaseProduct{
    private Integer minmumAge;
    private Boolean hypoallergenic;

    public Cat_Kids(String name, Integer cost, Integer amount, String item, Integer minimumAge, Boolean hypoallergenic) {
        super(name, cost, amount, item);
        this.minmumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return System.out.printf("Название %s, Цена %d, Количество в упаковке %s, Еденица измерения %s, Минимальный возраст " +
                "%d, Гипоаллергенный %b", getName(), getCost(), getAmount(), getItem(),minmumAge, hypoallergenic).toString();
    }

    public Integer getMinmumAge() {
        return minmumAge;
    }

    public Boolean getHypoallergenic() {
        return hypoallergenic;
    }
}