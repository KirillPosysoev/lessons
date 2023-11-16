package homework1;

import java.util.Scanner;

public class medium3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое положительное число для вычисления факториала");
        int a = console.nextInt();

        if (a >= 0) {

            long result = 1;
            for (int i = 1; i <= a; i++) {
                result *= i;
            }

            System.out.println(result);

        } else
            System.out.println("Вы ввели отрицательное число");
    }
}