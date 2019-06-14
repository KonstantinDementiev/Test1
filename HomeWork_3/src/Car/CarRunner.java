package Car;

public class CarRunner {
    public static void main(String[] args) {
        Car carr1 = new Car("Audi", 30.0, 60.0, 10.0, 400.0, false);
        Truck carr2 = new Truck("Volvo", 100.0, 200.0, 20.0, 3500);

        double fuel = 50.0;
 //       double howManyKm = carr1.getDistance() / 100 * carr1.getAveragefuel();
//        System.out.println(carr1.getMark());
//        carr1.addFuel(fuel);
//        carr1.onOffCar();
//        carr1.printInfo();
//        carr1.goCar(howManyKm);

        carr2.setMark("Volvo");
        carr2.setFuel(100.0);
        carr2.setMaxfuel(200.0);
        carr2.setAveragefuel(20.0);

        double distance = 700.0;
        double howManyKm = distance / 100 * carr2.getAveragefuel();

        carr2.addFuel(fuel);
        carr2.onOffCar();
        carr2.printInfo();
        carr2.goCar(howManyKm);


    }

}
