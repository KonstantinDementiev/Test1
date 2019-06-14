package HomeWork3;

public class Summa {

    public static void main(String[] args) {

        int n = 256984756;
        int sum = 0;
        sum(n, sum);
    }
    public static void sum(int n, int suma) {
        if (n != 0) {
            suma += n % 10;
            sum(n / 10, suma);
        } else System.out.println(suma);
    }
}
