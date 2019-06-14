import java.util.function.DoubleToIntFunction;

public class Random {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Исходный массив");
        soart1(arr);
        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        soart2(arr);
        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void soart1(int[] arr) {

        for (int j = 0; j < arr.length-2; j++) {
            for (int i = 0; i < arr.length-1; i++) {

                if (arr[i] < arr[i + 1]) {
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;

                }
            }
        }

    }
    public static void soart2(int[] arr) {

        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length-1; i++) {

                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;

                }
            }
        }

    }

}
