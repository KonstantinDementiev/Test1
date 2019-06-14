package HomeWork4;

import java.util.*;

public class FlatRunner {
    public static void main(String[] args) {
        Flat flat1 = new Flat(1, 50, 1, 1, "кирпич", 30);
        Flat flat2 = new Flat(2, 25, 3, 1, "монолит", 20);
        Flat flat3 = new Flat(3, 70, 5, 2, "панель", 15);
        Flat flat4 = new Flat(4, 120, 7, 5, "кирпич", 40);
        Flat flat5 = new Flat(5, 100, 9, 4, "монолит", 10);
        Flat flat6 = new Flat(6, 250, 11, 5, "панель", 18);
        Flat flat7 = new Flat(7, 95, 13, 4, "кирпич", 24);
        Flat flat8 = new Flat(8, 80, 15, 3, "монолит", 55);

        Flats f = new Flats();
        f.add(flat1);
        f.add(flat2);
        f.add(flat3);
        f.add(flat4);
        f.add(flat5);
        f.add(flat6);
        f.add(flat7);
        f.add(flat8);
        f.arrPrint();
        System.out.println(" ");

        int [] num = {1, 2, 3, 4, 5};
        int n = (int)(Math.random()*4);      // генерируем кол-во комнат случайно

        // По кол-ву комнат
        int rooms = num[n];
        f.sortFlats1(rooms);

        // По площади и этажности
        int area = 70;
        int floor = 3;
        f.sortFlats2(area, floor);

        // По возрастанию срока эксплуатации
        FlatComparator mySort = new FlatComparator();
        ArrayList<Flat> newList = f.getList();
        newList.sort(mySort);
        System.out.println("Сортировка по возрастанию срока эксплуатации");
        System.out.println(newList);
    }
}
