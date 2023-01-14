package Lections.Lec1.Ex001;

public class Program {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        // Lections.Lec1.Ex001.Point2D a = new Lections.Lec1.Ex001.Point2D(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());
        Point2D b = new Point2D(0);
        System.out.println(b.toString());
        // Lections.Lec1.Ex001.Point2D b = new Lections.Lec1.Ex001.Point2D(0, 10);

        System.out.println(Point2D.distance(a, b));

    }
}
