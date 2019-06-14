import java.util.Arrays;
import java.util.Collections;

public class Quicksort {

    public static void main(String[] args) {

        Integer arr[] = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Исходный массив");

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
