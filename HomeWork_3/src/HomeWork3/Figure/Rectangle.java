package HomeWork3.Figure;

public class Rectangle extends Figure {

    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public int area() {
        System.out.println("Rectangle area");
        return a * b;
    }

    @Override
    public int perim() {
        System.out.println("Rectangle perim");
        return (a + b) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
