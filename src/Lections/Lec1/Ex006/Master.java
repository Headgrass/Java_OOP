package Lections.Lec1.Ex006;

import java.util.Random;

public class Master {
    private static int number;
    private static Random r;

    private String name;
    private int hp;
    private int maxHp;

    private int strong;
    private int maxStrong;

    static {
        Master.number = 0;
        Master.r = new Random();
    }
    public Master(String name, int hp, int strong) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.strong = strong;
        this.maxStrong = strong;
    }

    public Master() {
        this(String.format("Hero_Master #%d", ++Master.number),
                Master.r.nextInt(100, 200),
                Master.r.nextInt(50, 150));
    }

    public int Work() {
        int item = Master.r.nextInt(20, 30);
        this.strong -= (int)(item * 0.8);
        if (strong < 0) return 0;
        else return item;
    }

    public String getInfo() {
        return String.format("Name: %s Hp: %d Energy: %d Type: %s", name, hp, strong, number);
    }

    public void healed(int Hp) {
        this.hp = Math.min(Hp + this.hp, this.maxHp);
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
    }
}

