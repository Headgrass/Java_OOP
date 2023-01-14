package Lections.Lec1.Ex001;

/**
 * Это конструктор 2D
 */
public class Point2D {
    private int x, y;

    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0);
    }

//    public Lections.Lec1.Ex001.Point2D() {
//        x = value;
//        y = value;
//    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }
    public void setY(int value) {
        this.y = value;
    }

    private String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }
}
