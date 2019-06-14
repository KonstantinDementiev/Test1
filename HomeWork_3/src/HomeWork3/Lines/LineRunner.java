package HomeWork3.Lines;

public class LineRunner {
    public static void main(String[] args) {
        Lines list = new Lines();
        Line l1 = new Line(new Point(0,0), new Point(1,1));
        Line l2 = new Line(new Point(0,0), new Point(2,2));
        Line l3 = new Line(new Point(0,0), new Point(3,3));
        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(new Line(new Point(0,0), new Point(4,4)));
        list.add(new Line(new Point(0,0), new Point(5,5)));
        System.out.println("Добавлено " + list.size() + " линий");
        System.out.println("Сумма линий " + list.sumLength());
        Line longest = list.longestLine();
        System.out.println("Наиболее длинная линия " + longest);
        System.out.println("Ее длина " + longest.getLength());
    }
}
