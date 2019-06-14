package HomeWork4;

import java.util.ArrayList;

public class Flats {

    private static ArrayList<Flat> flats;


    public Flats() {
        flats = new ArrayList<>();
    }

    public void add(Flat flat) {
        flats.add(flat);
    }

    public void sortFlats1(int rooms) {
        int count = 0;
        System.out.println("Выборка по кол-ву комнат:");
        for (Flat f : flats) {
            if (f.getRooms() == rooms) {
                System.out.println(f);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("По данному запросу совпадений не найдено");
        }
        System.out.println(" ");
    }

    public void sortFlats2(int area, int floor) {
        int count = 0;
        System.out.println("Сортировка по площади и этажности:");
        for (Flat f : flats) {
            if (f.getArea() > area && f.getFloor() > floor) {
                System.out.println(f);
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
        for (Flat f : flats) {
            System.out.println(f);
        }

    }
}
