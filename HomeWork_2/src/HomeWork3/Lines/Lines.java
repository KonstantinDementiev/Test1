package HomeWork3.Lines;
import java.util.ArrayList;
public class Lines {
    private final ArrayList<Line> lines;

    public Lines() {
        lines = new ArrayList<>();
    }

    public void add(Line line) {
        lines.add(line);
    }

    public int size() {
        return lines.size();
    }

    public double sumLength() {
        double sum = 0;
        for (Line line : lines) {
            sum += line.getLength();
        }
        return sum;
    }

    public Line longestLine() {
        if (lines.isEmpty()) {
            System.out.println("List is empty");
            return null;
        } else {
            Line longestLine = lines.get(0);
            for (Line line : lines) {
                if (line.getLength() > longestLine.getLength()) {
                    longestLine = line;
                }
            }
            return longestLine;
        }
    }
}
