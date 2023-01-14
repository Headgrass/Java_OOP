package Lections.Lec1.Ex004;

public class Robot1 {
    /** Уровень робота */
    private int level;

    /**Имя робота */
    private String name;

    /**
     * @param name Имя робота не должно начинаться с цифры
     * @param level Уровень робота
     */
    public Robot1(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    // Методы вкл/выкл подсистем

    //** Загрузка BIOS */
    private void startBIOS() { System.out.println("Start BIOS..."); }

    //** Загрузка OS */
    private void startOS() { System.out.println("Start OS..."); }

    //**Приветствие */
    private void sayHi() { System.out.println("Hello, world!"); }

    //**Выгрузка BIOS */
    private void stopBIOS() { System.out.println("Stop BIOS..."); }

    //** Выгрузка OS */
    private void stopOS() { System.out.println("Stop OS..."); }

    //**Прощание */
    private void sayBye() { System.out.println("Bye..."); }

    //**Работа */
    public void work() { System.out.println("Working..."); }
}
