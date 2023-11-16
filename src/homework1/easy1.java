package homework1;

import java.util.Scanner;

public class easy1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 2 целых числа");
        int a = console.nextInt();
        int b = console.nextInt();
        System.out.println((a == b) ? "Числа равны" : ((a > b) ? "Перовое число больше второго" : "Второе число больше первого"));
    }
}
