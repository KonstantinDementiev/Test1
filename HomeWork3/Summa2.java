package HomeWork3;

import java.util.Scanner;

public class Summa2 {
    public static void main(String[] args) {

        Scanner outData = new Scanner(System.in);

        int summa = 0;

        System.out.println("Введите натуральное число: ");
        String data = outData.nextLine();
        char[] symbol = data.toCharArray();

        for (int i = 0; i < symbol.length; i++) {
            summa = summa + Character.getNumericValue(symbol[i]);
        }

        System.out.print("Сумма чисел из числа " + data + " равна " + summa + ";");
    }
}

