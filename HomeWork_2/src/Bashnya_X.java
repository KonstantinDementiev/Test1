public class Bashnya_X {
    public static void main(String[] args) {

        int[][] arr = new int[5][3];
        int[] x = new int[5];

        for (int k = 0; k < arr.length; k++) {
            arr[k][0] = k + 1;
        }

        prin(arr);
        pust(arr);
        sort(arr);
        verx(arr, x);
        sort2(arr, x);
        pust(arr);
        verx(arr, x);
        sort3(arr, x);


    }

    public static void pust(int arr[][]) {

        for (int i = 0; i < 5; i++) {

            if (arr[arr.length - 1][1] == 0) {
                arr[arr.length - 1][1] = arr[i][0];
                arr[i][0] = 0;

            } else {

                if (arr[arr.length - 1][2] == 0) {
                    arr[arr.length - 1][2] = arr[i][0];
                    arr[i][0] = 0;

                }
            }

        }
        prin(arr);
    }

    public static void sort(int arr[][]) {
        int i = 4;

        if (arr[i][1] < arr[i][2]) {
            arr[i - 1][2] = arr[i][1];
            arr[i][1] = 0;
            prin(arr);
        } else {
            arr[i - 1][1] = arr[i][2];
            arr[i][2] = 0;
            prin(arr);
        }
        pust(arr);

    }

    public static void prin(int arr[][]) {

        System.out.println(" ");
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[0].length; k++) {
                System.out.print(arr[j][k] + " ");
            }
            System.out.println(" ");
        }
    }


    public static void verx(int arr[][], int x[]) {

        x[0] = 0;
        x[1] = 0;
        x[2] = 0;


        for (x[0] = 0; x[0] < arr.length; x[0]++) {
            if (arr[x[0]][0] != 0) {
                break;
            }
        }
        for (x[1] = 0; x[1] < arr.length; x[1]++) {
            if (arr[x[1]][1] != 0) {
                break;
            }
        }
        for (x[2] = 0; x[2] < arr.length; x[2]++) {
            if (arr[x[2]][2] != 0) {
                break;
            }
        }
    }

    public static void sort2(int arr[][], int x[]) {

        if (arr[x[2] + 1][2] < arr[x[1]][1] & arr[x[2]][2] < arr[x[0]][0]) {
            arr[x[0] - 1][0] = arr[x[2]][2];
            arr[x[2]][2] = 0;
            prin(arr);
            arr[x[1] - 1][1] = arr[x[2] + 1][2];
            arr[x[2] + 1][2] = 0;
            prin(arr);
            arr[x[1] - 2][1] = arr[x[0] - 1][0];
            arr[x[0] - 1][0] = 0;
            prin(arr);

        }

    }

    public static void sort3(int arr[][], int x[]) {

        arr[x[2] - 1][2] = arr[x[1]][1];
        arr[x[1]][1] = 0;
        prin(arr);
        arr[x[0] - 1][0] = arr[x[1] + 1][1];
        arr[x[1] + 1][1] = 0;
        prin(arr);
        arr[x[0] - 2][0] = arr[x[2] - 1][2];
        arr[x[2] - 1][2] = 0;
        prin(arr);
        arr[x[2] - 1][2] = arr[x[1] + 2][1];
        arr[x[1] + 2][1] = 0;
        prin(arr);

        arr[4][1] = arr[2][0];
        arr[2][0] = 0;
        prin(arr);

        arr[2][2] = arr[3][0];
        arr[3][0] = 0;
        prin(arr);

        arr[1][2] = arr[4][1];
        arr[4][1] = 0;
        prin(arr);


    }
}