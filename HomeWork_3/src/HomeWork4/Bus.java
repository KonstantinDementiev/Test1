package HomeWork4;

public class Bus {

    private String name;
    private int numberBus;
    private int numberRoute;
    private String mark;
    private int year;
    private int distance;

    public int getNumberRoute() {
        return numberRoute;
    }

    public int getYear() {
        return year;
    }

    public int getDistance() {
        return distance;
    }

    public Bus(String name, int numberBus, int numberRoute, String mark, int year, int distance) {
        this.name = name;
        this.numberBus = numberBus;
        this.numberRoute = numberRoute;
        this.mark = mark;
        this.year = year;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "name = '" + name + '\'' +
                ", numberBus = " + numberBus +
                ", numberRoute = " + numberRoute +
                ", mark = '" + mark + '\'' +
                ", year = " + year +
                ", distance = " + distance +
                '}';
    }
}
