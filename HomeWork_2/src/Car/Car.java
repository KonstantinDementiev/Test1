package Car;

public class Car {
    //Название
    private String mark;

    //Топливо
    private double fuel;

    //Размер бака
    private double maxfuel;

    //Средний расход
    private double averagefuel;

    //Дистанция
    private double distance;

    //Работает / Выключено
    private boolean onOff;

    public Car() {
        this.mark = " ";
        this.fuel = 0.0;
        this.maxfuel = 0.0;
        this.averagefuel = 0.0;
        this.distance = 0.0;
        this.onOff = false;
    }

    public Car(String mark, double fuel, double maxfuel, double averagefuel, double distance, boolean onOff) {
        this.mark = mark;
        this.fuel = fuel;
        this.maxfuel = maxfuel;
        this.averagefuel = averagefuel;
        this.distance = distance;
        this.onOff = onOff;
    }

    //При добавлении топлива поверять поместится ли в бак

    public void addFuel(double fuel) {
        if (fuel < this.maxfuel - this.fuel) {
            System.out.println("Заправлено " + fuel + " литров");
            this.fuel += fuel;
        } else {
            System.out.println("Столько топлива не влезет!");
        }
    }

    //Начать поездку
    //Проверить заведена ли
    //Проверить хватит ли топлива на поезку учитывая средний расход и остаток топлива
    //Вывести сколько топлива потратится на поездку и сколько останется

    public void goCar(double howManyKm) {
        if (onOff = false) {
            System.out.println("Машина НЕ заведена!");
        } else {
            System.out.println("Машина заведена.");
            howManyKm = this.distance / 100 * this.averagefuel;
            if (this.fuel < howManyKm) {
                System.out.println("Для этой поездки надостаточно топлива!");
            } else {
                System.out.println("На поездку потребуется " + howManyKm + " литров топлива");
                System.out.println("После поездки у Вас останется " + (this.fuel - howManyKm) + "литров");
            }
        }
    }
    //При запуска проверять есть ли топливо
    //Если не заведена, то включить

    public void onOffCar() {
        if (this.fuel <= 0.0) {
            System.out.println("Топливный бак пуст!");
        }
        else {
            if (this.onOff == false){
                System.out.println("Завожу машину.");
                this.onOff = true;
            }
        }
    }
    public void printInfo() {
        if (this.onOff == false) {
            System.out.println("Машина НЕ заведена!");
        }
        else {
            System.out.println("Машина заведена.");
        }
        if (this.fuel <= 0.0) {
            System.out.println("Топливный бак пуст!");
        }
        else {
            System.out.println("В топливном баке " + this.fuel + "литров");
        }

    }

}
