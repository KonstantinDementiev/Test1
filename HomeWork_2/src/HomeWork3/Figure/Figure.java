package HomeWork3.Figure;

public class Figure {
    protected int a;
    protected int b;
    private int z;

    public Figure() {
        this.a = 0;
        this.b = 0;
    }

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
        z = 777;
    }

    public int perim(){
        System.out.println("Figure perim");
        return 0;
    }

    public int area(){
        System.out.println("Figure area");
        return 0;
    }

    public String toString() {
        return "Figure{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
