package HomeWork3.Books;

public class BooksRunner {
    public static void main(String[] args) {
        Books b = new Books();
        Book b1 = new Book(1, "Fun Fun", "Rimskiy", "Svema", 1965, 300, 165.50, "Pur");
        Book b2 = new Book(2, "Moon", "Rimskiy", "Varta", 1974, 150, 75.90, "Pur");
        Book b3 = new Book(3, "Tomorrow", "Valera", "Varta", 1982, 220, 120.60, "Bad");
        Book b4 = new Book(4, "I'l be back", "John Woo", "Pravda", 1945, 400, 190.25, "Bad");
        Book b5 = new Book(5, "451", "John Woo", "Svema", 1999, 280, 95.60, "Good");
        Book b6 = new Book(6, "Go Home", "Valera", "Pravda", 2010, 310, 235.00, "Good");

        b.add(b1);
        b.add(b2);
        b.add(b3);
        b.add(b4);
        b.add(b5);
        b.add(b6);


        String aut = "John Woo";
        String pub = "Pravda";
        int y = 1990;

        Books.addSortBook(aut, pub, y);

    }
}
