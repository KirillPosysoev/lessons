package homework3;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {333, 4444, 0, 444, 5, 0, -222, 6, 4, 5};
        int num = 6;
        int[][] array2 = doubleArray(array);
        array2 = bubbleSort(array2);
//        System.out.println(Arrays.toString(array2[0]));
//        System.out.println(Arrays.toString(array2[1]));
        System.out.println(binarySearch(array2, num, 0, array.length - 1));
    }

    static int[][] doubleArray(int[] array) {
        int[][] array2 = new int[2][array.length];
        array2[0] = array;
        for (int i = 0; i < array.length; i++) {
            array2[1][i] = i;
        }
        return array2;

    }

    static int[][] bubbleSort(int[][] array) { //сортировка пузырьком
        for (int i = 0; i < array[0].length - 1; i++) {
            for (int j = 0; j < array[0].length - 1; j++) {
                int buffElements;
                int buffIndex;
                if (array[0][j] > array[0][j + 1]) {
                    buffElements = array[0][j];
                    buffIndex = array[1][j];
                    array[0][j] = array[0][j + 1];
                    array[1][j] = array[1][j + 1];
                    array[0][j + 1] = buffElements;
                    array[1][j + 1] = buffIndex;
                }
            }
        }
        return array;
    }

    static int binarySearch(int[][] array, int value, int l, int r) {
        if (l == r) {
            if (array[0][l] == value) {
                return array[1][l];
            }
            return -1;
        }
        int m = l + (r - l) / 2;
        if (value > array[0][m]) {
            return binarySearch(array, value, m + 1, r);
        } else if (value < array[0][m]) {
            return binarySearch(array, value, l, m - 1);
        }
        return array[1][m];
    }
}
