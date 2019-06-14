package HomeWork3.Figure;

public class Triangle extends Figure{

    private int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public int area() {
        System.out.println("Triangle area");
        return (int)Math.sqrt((a + super.b + c)*2);
    }

    @Override
    public int perim(){
        System.out.println("Triangle perim");
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
