package HomeWork4;

import java.util.ArrayList;

public class Buses {
    private static ArrayList<Bus> buses;

    public Buses() {
        buses = new ArrayList<>();
    }

    public void add(Bus bus) {
        buses.add(bus);
    }

    public void sortBus1(int route) {
        int count = 0;
        System.out.println("Сортировка по номеру маршрута:");
        for (Bus b : buses) {
            if (b.getNumberRoute() == route) {
                System.out.println(b);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("По данному запросу совпадений не найдено");
        }
        System.out.println(" ");
    }

    public void sortBus2(int term) {
        int count = 0;
        System.out.println("Сортировка по сроку эксплуатации:");
        for (Bus b : buses) {
            if (2018 - b.getYear() > term) {
                System.out.println(b);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("По данному запросу совпадений не найдено");
        }
        System.out.println(" ");
    }

    public void sortBus3(int dist) {
        int count = 0;
        System.out.println("Сортировка по пробегу:");
        for (Bus b : buses) {
            if (b.getDistance() > dist) {
                System.out.println(b);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("По данному запросу совпадений не найдено");
        }
        System.out.println(" ");
    }

    public void arrPrint() {
        System.out.println(" ");
        for (Bus b : buses) {
            System.out.println(b);
        }

    }
}