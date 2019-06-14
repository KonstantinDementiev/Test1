package Car;

public class Truck extends Car {

    private int weight;

    public Truck(Truck ob) {
        super(ob);
        weight = ob.weight;
    }

    public Truck() {
        super();
        this.weight = 0;
    }

    public Truck(String mark, double fuel, double maxfuel, double averagefuel, int weight) {
        super();
        this.weight = weight;
    }

    @Override
    public void addFuel(double fuel) {
        super.addFuel(fuel);
    }

}
