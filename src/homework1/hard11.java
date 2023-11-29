package homework1;

import java.util.Scanner;

public class hard11 { //Перевод в римские цифры
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ведите натуральное число менее 4000 (целое, положительное)");

        if (console.hasNextLong()) {
            int num = console.nextInt();
            if (num <= 0 || num >= 4000)
                System.out.println("Увы, ваше число не соответствует условиям");

            else {
                String[] rimName = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
                int[] rimNum = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

                for (int i = 0; i < rimNum.length; i++) {

                    if (num / rimNum[i] > 0) {

                        for (int j = 1; j <= num / rimNum[i]; j++) {
                            System.out.print(rimName[i]);
                        }
                        num -= num / rimNum[i] * rimNum[i];
                    }
                }
            }
        } else
            System.out.println("Вы ввели не число");

    }
}
