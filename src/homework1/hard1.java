package homework1;

import java.util.Scanner;

public class hard1 { //Перевод в римские цифры
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ведите натуральное число менее 4000 (целое, положительное)");
        if (console.hasNextLong()) {
            int num = console.nextInt();
            if (num <= 0 || num >= 4000)
                System.out.println("Ваше число не соответствует условиям");
            else {

                if (num / 1000 > 0) {
                    for (int i = 1; i <= num / 1000; i++) {
                        System.out.print("M");
                    }
                    num -= num / 1000 * 1000;
                }
                if (num / 900 > 0) {
                    System.out.print("СM");
                    num -= 900;
                }
                if (num / 500 > 0) {
                    System.out.print("D");
                    num -= 500;
                }
                if (num / 400 > 0) {
                    System.out.print("CD");
                    num -= 400;
                }
                if (num / 100 > 0) {
                    for (int i = 1; i <= num / 100; i++) {
                        System.out.print("C");
                    }
                    num -= num / 100 * 100;
                }
                if (num / 90 > 0) {
                    System.out.print("XC");
                    num -= 90;
                }
                if (num / 50 > 0) {
                    System.out.print("L");
                    num -= 50;
                }
                if (num / 40 > 0) {
                    System.out.print("XL");
                    num -= 40;
                }
                if (num / 10 > 0) {
                    for (int i = 1; i <= num / 10; i++) {
                        System.out.print("X");
                    }
                    num -= num / 10 * 10;
                }
                if (num / 9 > 0) {
                    System.out.print("IX");
                    num -= 9;
                }
                if (num / 5 > 0) {
                    System.out.print("V");
                    num -= 5;
                }
                if (num / 4 > 0) {
                    System.out.print("IV");
                    num -= 4;
                }
                if (num > 0) {
                    for (int i = 1; i <= num; i++) {
                        System.out.print("I");
                    }
                }
            }
        } else
            System.out.println("Вы ввели не число");

    }
}
