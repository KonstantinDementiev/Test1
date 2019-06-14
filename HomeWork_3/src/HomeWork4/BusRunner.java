package HomeWork4;

public class BusRunner {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Иван Иванов", 2368, 150, "Mersedes", 2004, 50000);
        Bus bus2 = new Bus("Петр Петров", 6874, 198, "Toyota", 2010, 30000);
        Bus bus3 = new Bus("Сидр Сидоров", 3921, 147, "Mersedes", 2007, 120000);
        Bus bus4 = new Bus("Вано Гибридзе", 9217, 134, "Богдан", 1998, 150000);
        Bus bus5 = new Bus("Илья Фомин", 8649, 134, "Богдан", 1998, 150000);
        Bus bus6 = new Bus("Игорь Патлатюк", 3137, 147, "Toyota", 2002, 85000);
        Bus bus7 = new Bus("Михаил Боярский", 6193, 150, "Mersedes", 2008, 40000);
        Bus bus8 = new Bus("Валерий Леонтьев", 4649, 198, "Mersedes", 2012, 20000);

        Buses b = new Buses();
        b.add(bus1);
        b.add(bus2);
        b.add(bus3);
        b.add(bus4);
        b.add(bus5);
        b.add(bus6);
        b.add(bus7);
        b.add(bus8);
        b.arrPrint();
        System.out.println(" ");

        int [] num = {134, 147, 150, 198};
        int n = (int)(Math.random()*3);      // генерируем номер маршрута случайно

        // Номер маршрута
        int route = num[n];
        b.sortBus1(route);

        // Срок эксплуатации
        int term = 10;
        b.sortBus2(term);

        // Пробег
        int dist = 100000;
        b.sortBus3(dist);


    }
}
