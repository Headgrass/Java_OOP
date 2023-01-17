package HomeWorks.HW1;

/**
 * 4. Детские товары:
 * 4.1 Минимальный возраст
 * 4.2 Гипоаллергенность
 */
public class Kids extends BaseProduct{

    private Integer minimumAge;
    private Boolean hypoallergenic;
    public Kids(String name, Integer cost, Integer amount, String item, Integer minimumAge, Boolean hypoallergenic) {
        super(name, cost, amount, item);
        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
