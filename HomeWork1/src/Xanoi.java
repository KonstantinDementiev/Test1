
public class Xanoi {


    public static void main(String[] args) {

        int k = 3;

        System.out.println("Решение для " + k + " дисков");
        SolutionHanoibns(k, 'A', 'C', 'B');
    }

    private static void SolutionHanoibns(int k, char a, char b, char c) {
        if (k > 0) {
            SolutionHanoibns(k - 1, a, c, b);
            System.out.println("Переложить диск из " + a + " в " + b);
            SolutionHanoibns(k - 1, c, b, a);

        }
    }

}