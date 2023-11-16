package homework1;

import java.util.Scanner;

public class easy2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = console.nextInt();
        System.out.println((a % 2 == 0) ? "Число четное" : "Число нечетное");
    }
}
