public class ShellSort {

    public static void main(String[] args) {

        int[] arr = {15, 16, 13, 12, 11, 9, 10, 8, 7, 6, 5, 14, 4, 3, 2, 1};
        int count = 0;
        sort(arr);

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
            count++;
        }
        System.out.println(" ");
        System.out.print(count);
    }


    private static void sort(int[] arr) {
        int increment = arr.length / 2;
        while (increment >= 1) {
            for (int startIndex = 0; startIndex < increment; startIndex++) {
                insertionSort(arr, startIndex, increment);
            }
            increment = increment / 2;
        }
    }

    private static void insertionSort(int[] arr, int startIndex, int increment) {
        for (int i = startIndex; i < arr.length - 1; i = i + increment) {
            for (int j = Math.min(i + increment, arr.length - 1); j - increment >= 0; j = j - increment) {
                if (arr[j - increment] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - increment];
                    arr[j - increment] = tmp;
                } else {
                    break;
                }
            }
        }
    }
}