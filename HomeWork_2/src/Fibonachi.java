public class Fibonachi {
    public static void main(String[] args) {

        int[] arr = new int[80];
        int step = 30;

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < step; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i = 0; i < step; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

