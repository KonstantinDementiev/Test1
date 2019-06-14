package HomeWork4;

import java.util.Comparator;

public class FlatComparator implements Comparator<Flat> {

    public int compare(Flat f1, Flat f2) {
        if (f1.getYears() < f2.getYears()) {
            return -1;
        } else if (f1.getYears() > f2.getYears()) {
            return 1;
        } else {
            return 0;
        }

    }
}
