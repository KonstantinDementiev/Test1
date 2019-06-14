package HomeWork3;


import java.util.ArrayList;

public class Books {

    public static void addSortBook(String aut, String pub, int y) {

        Book b1 = new Book(1, "Fun Fun", "Rimskiy", "Svema", 1965, 300, 165.50, "Pur");
        Book b2 = new Book(2, "Moon", "Rimskiy", "Varta", 1974, 150, 75.90, "Pur");
        Book b3 = new Book(3, "Tomorrow", "Valera", "Varta", 1982, 220, 120.60, "Bad");
        Book b4 = new Book(4, "I'l be back", "John Woo", "Pravda", 1945, 400, 190.25, "Bad");
        Book b5 = new Book(5, "451", "John Woo", "Svema", 1999, 280, 95.60, "Good");
        Book b6 = new Book(6, "Go Home", "Valera", "Pravda", 2010, 310, 235.00, "Good");

        ArrayList<Book> books = new ArrayList();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);

        System.out.println("Сортировка по автору:");
        for (Book b : books) {
            if (b.getAutors() == aut) {
                System.out.println(b);
            }
        }

        System.out.println(" ");
        System.out.println("Сортировка по издательству:");
        for (Book b : books) {
            if (b.getPublish() == pub) {
                System.out.println(b);
            }
        }

        System.out.println(" ");
        System.out.println("Сортировка по году выпуска:");
        for (Book b : books) {
            if (b.getYear() > y) {
                System.out.println(b);
            }
        }
    }

}

