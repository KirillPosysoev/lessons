package homework1;

import java.util.Scanner;

public class medium1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 2 целых числа и знак операции");
        int a = console.nextInt();
        int b = console.nextInt();
        char calc = console.next().charAt(0);

        if (calc == '+')
            System.out.println(a + b);

        else if (calc == '-')
            System.out.println(a - b);

        else if (calc == '*')
            System.out.println(a * b);

        else if (calc == '/') {
            double result = a * 1.0 / b;
            System.out.println(result);

        } else
            System.out.println("Неизввестная операция");
    }
}


