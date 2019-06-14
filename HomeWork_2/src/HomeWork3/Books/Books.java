package HomeWork3.Books;


import java.util.ArrayList;

public class Books {

    private static ArrayList<Book> books;

    public Books() {
        books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }


    public static void addSortBook(String aut, String pub, int y) {

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

