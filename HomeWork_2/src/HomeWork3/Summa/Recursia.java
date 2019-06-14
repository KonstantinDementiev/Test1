package HomeWork3.Summa;

public class Recursia {

    public static void main(String[] args) {

        System.out.println(fib(10));
    }

    private static int fib(int arg) {

        if (arg == 0) {
            return 0;
        }
        if (arg == 1) {
            return 1;
        } else {
            return fib(arg - 2) + fib(arg - 1);

            //return (arg < 2) ? arg : fib(arg - 2) + fib(arg - 1);


        }
    }
}