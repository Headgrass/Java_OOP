package HomeWorks.HW1;

/**
 * 4. Детские товары:
 * 4.1 Минимальный возраст
 * 4.2 Гипоаллергенность
 */
public class Kids extends BaseProduct{
    public Kids(String name, Integer cost, Integer amount, String item, Integer minimumAge, Boolean hypoallergenic) {
        super(name, cost, amount, item);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
