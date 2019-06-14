package Car;

public class CarRunner {
    public static void main(String[] args) {
        Car carr1 = new Car("Audi", 40.0, 60.0, 10.0, 500.0, false);

        double fuel = 15.0;

        carr1.addFuel(fuel);
    }

}
