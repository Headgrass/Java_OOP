package Lections.Lec1.Ex004;

public class Program {
    public static void main(String[] args) {
        Robot1 robot1 = new Robot1("name_1", 1);

        System.out.printf("%s %d\n", robot1.getName(), robot1.getLevel());
        robot1.powerOn();
        robot1.work();
        robot1.work();
        robot1.work();
        robot1.work();
        robot1.powerOff();

        Robot3 robot3 = new Robot3("name_3");
        System.out.println("-------------");
        System.out.println(robot3);
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();

        robot3.power();
    }
}
