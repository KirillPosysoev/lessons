package homework3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {44, 444, 5, -222, 6, 3333};
        System.out.println(Arrays.toString(insertSort(array)));
    }

    static int[] insertSort(int[] array) {  //сортировка массива по убыванию методом вставки
        int insertElem;
        for (int i = 1; i < array.length; i++) {
            int j = i;
            do {
                if (array[j] > array[j - 1]) {
                    insertElem = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = insertElem;
                    j--;
                } else
                    break;
            }
            while (j > 0);
        }
        return array;
    }
}

