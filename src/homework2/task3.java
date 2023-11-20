package homework2;

import java.util.Arrays;

public class task3 { //нахождение индексов минимального числа в двумерном массиве
    public static void main(String[] args) {
        int[][] arrayNum = {{-665, -11, -99}, {-100, -1, 6, -12}};
        int minNum = arrayNum[0][0];
        int[] indexMinNum = {0, 0};
        for (int i = 0; i < arrayNum.length; i++) {
            for (int j = 0; j < arrayNum[i].length; j++) {
                if (arrayNum[i][j] < minNum) {
                    minNum = arrayNum[i][j];
                    indexMinNum[0] = i;
                    indexMinNum[1] = j;
                }
            }
        }
        System.out.println(Arrays.toString(indexMinNum));
    }
}
