package Lections.Lec1.Ex006;

public class Magician extends BaseHero {

    private int mana;
    private int maxMana;

    public Magician() {
        super(String.format("Hero_Magician #%d", ++Magician.number),
                Magician.r.nextInt());
        this.maxMana = Magician.r.nextInt();
        this.mana = maxMana;
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt();
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }
}