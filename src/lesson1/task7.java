package lesson1;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        if (n > 999 && n < 10000) {
            int end = n % 10;
            int start = n / 1000;
            int second = (n/100)%10;
            int third = (n%100)/10;
            System.out.println((end == start && second == third) ? "Полиндром" : "Не полиндром");

        } else {
            System.out.println("Вы ввели некорректное число");
        }
    }
}
