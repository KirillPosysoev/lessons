package lesson1;


import java.util.Scanner;

public class task9 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = x > 0 ? (x < 100 ? 1 : 0) : -1;
            // x < 100 ? 1 : 0 - ВЛОЖЕННОЕ выражение
            // x > 0 ? ВЛОЖЕННОЕ : -1

            System.out.println(y);
        }
    }


