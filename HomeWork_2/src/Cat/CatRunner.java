package Cat;

public class CatRunner {
    public static void main(String[] arg) {
        Cat[] myCats = {new Cat(), new BritishCat(), new PersianCat()};
        for (Cat c : myCats) {
            c.move();
        }

        Cat myCat1 = new BritishCat();
        BritishCat myCat2 = (BritishCat)myCat1;
        System.out.println(myCat1 instanceof PersianCat);
        if (myCat1 instanceof PersianCat) {
            PersianCat myCat3 = (PersianCat) myCat1;
        }
    }
}
