package HomeWork3.Lines;

public class Line {
    private final Point a;
    private final Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public double getLength() {
        double length = 0;
        length = (b.getX() - a.getX()) + (b.getY() - a.getY());
        return length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
