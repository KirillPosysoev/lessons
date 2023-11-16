package homework1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class medium2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год");
        int year = console.nextInt();
        if (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0))
            System.out.println("Год високосный");
        else
            System.out.println("Год не високосный");


    }
}