package HomeWork4;

public class Flat {
    private int number;
    private int area;
    private int floor;
    private int rooms;
    private String type;
    private int years;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Flat(int number, int area, int floor, int rooms, String type, int years) {
        this.number = number;
        this.area = area;
        this.floor = floor;
        this.rooms = rooms;
        this.type = type;
        this.years = years;
    }

    @Override
    public String toString() {
        return "Flat {" +
                "number = " + number +
                ", area = " + area +
                ", floor = " + floor +
                ", rooms = " + rooms +
                ", type = '" + type + '\'' +
                ", years = " + years +
                '}';
    }
}
