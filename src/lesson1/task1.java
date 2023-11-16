package lesson1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        System.out.println("a = " + a + " b = " + b + " c = "+ c);

        int buffer = c;
        c = b;
        b = a;
        a = buffer;


        System.out.println("a = " + a + " b = " + b + " c = "+ c);




    }


}
