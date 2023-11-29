package homework3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {333, 4, 5, -222, 0, -33};
        selectSortArray(array);
        System.out.println(Arrays.toString(array));
    }
    static int[] selectSortArray(int[] array) { //сортировка выбором
        for (int i = 0; i < array.length; i++) {
            int[] arrayUnsortPart = Arrays.copyOfRange(array, i, array.length);
            int minElementIndex = minElementIndex(arrayUnsortPart);
            int minElementValue = arrayUnsortPart[minElementIndex];
            if (array[i] > minElementValue) {
                array[minElementIndex + i] = array[i];
                array[i] = minElementValue;
            }
        }
        return array;
    }
    static int minElementIndex(int[] array) {  //минимальный элемент
        int minElementIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[minElementIndex] > array[i])
                minElementIndex = i;
        }
        return minElementIndex;
    }
}

