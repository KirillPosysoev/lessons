package homework1;

import java.util.Scanner;

public class hard2 { //Проверка на простое число
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ведите натуральное число (целое, положительное)");
        if (console.hasNextLong()) {
            long num = console.nextLong();
            if (num > 0) {
                for (long i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        System.out.println("Число не является простым, делится на " + i);
                        System.exit(0);
                    }
                }
                System.out.println("Число является простым");

            } else
                System.out.println("Вы ввели ненатуральное число");

        } else
            System.out.println("Вы ввели не число");
    }
}
