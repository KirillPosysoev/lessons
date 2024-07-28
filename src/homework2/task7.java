package homework2;

import java.util.Arrays;

public class task7 {
    private static void printResult(int num) {
        System.out.println("Число " + num + " уникально");
    }

    public static void main(String[] args) {
        int[] arrayNum = {-11, 2, 2, 0, -11, -3, -3};
        Arrays.sort(arrayNum);
        for (int i = 1; i <= arrayNum.length; i += 2) {
            if (i == arrayNum.length) {
                printResult(arrayNum[i - 1]);
            } else if
            (arrayNum[i] != arrayNum[i - 1]) {
                printResult(arrayNum[i - 1]);
                break;
            }
        }
    }
}