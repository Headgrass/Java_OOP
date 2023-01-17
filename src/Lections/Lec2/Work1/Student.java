package Lections.Lec2.Work1;

/**
 * 1. Школьник, содержащий следующие свойства:
 *  *   1.1. ФИО
 *  *   1.2. Средний балл
 *  *   1.3. Номер класса,
 *  * а так же содержащие следующие методы:
 *  *   1.4 Играть
 *  *   1.5 Учиться,
 *  * выводящие на экран фразы "Я играю" и "Я учусь" соответственно.
 */
public class Student {
    private String name;
    private int mark;
    private int classNumber;


    public Student(String name, int mark, int classNumber) {
        this.name = name;
        this.mark = mark;
        this.classNumber = classNumber;
    }

    public abstract void play();
    public abstract void study();

    @Override
    public String toString() {
        return String.format();
    }
}
