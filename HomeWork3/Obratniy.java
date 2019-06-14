package HomeWork3;

public class Obratniy {

    public static void main(String[] args) {

        int n = 987654321;
        int digit = 0;
        obrat(n, digit);
    }

    public static void obrat(int n, int digit) {

        if (n != 0) {
            digit = (n % 10);
            System.out.print(digit);
            obrat(n/10, digit);
        }
        else {
            return;
        }
    }
}
