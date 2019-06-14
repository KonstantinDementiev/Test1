package Cat;

public class Cat {
    public void move() {
        System.out.println("Cat move");
    }
}

class BritishCat extends Cat {
    @Override
    public void move(){
        System.out.println("British cat move");
    }
}

class PersianCat extends Cat {
    @Override
    public void move(){
        System.out.println("Persian cat move");
    }
}
