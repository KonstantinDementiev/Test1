public class SortShell {

    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int gr, a, c, i, j;

        for (a = arr.length / 2; a > 1; a = a / 2) {
            gr = arr.length / a;
            for (j = 1; j == gr - 1; j++) {
                for (i = j - 1; i == a-1; i++) {
                    if (arr[j * i] > arr[j * i + a]) {
                        c = arr[j * i];
                        arr[j * i] = arr[j * i + a];
                        arr[j * i + a] = c;
                    }

                }
            }

        }
        for (int ii = 0; ii < arr.length; ii++) {
            System.out.println(arr[ii]);

        }
    }
}


