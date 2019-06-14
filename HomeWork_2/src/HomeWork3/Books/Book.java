package HomeWork3.Books;

public class Book {
    private int id;
    private String name;
    private String autors;
    private String publish;
    private int year;
    private int numpages;
    private double price;
    private String binding;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutors() {
        return autors;
    }

    public void setAutors(String autors) {
        this.autors = autors;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumpages() {
        return numpages;
    }

    public void setNumpages(int numpages) {
        this.numpages = numpages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }


    public Book(int id, String name, String autors, String publish, int year, int numpages, double price, String binding) {
        this.id = id;
        this.name = name;
        this.autors = autors;
        this.publish = publish;
        this.year = year;
        this.numpages = numpages;
        this.price = price;
        this.binding = binding;

    }

    public String toString() {
        return "Book {" +
                "id = '" + id + '\'' +
                ", name = '" + name + '\'' +
                ", autors = '" + autors + '\'' +
                ", publish = '" + publish + '\'' +
                ", year = '" + year + '\'' +
                ", numpages = '" + numpages + '\'' +
                ", price = '" + price + '\'' +
                ", binding = '" + binding + '\'' +
                '}';
    }

}
