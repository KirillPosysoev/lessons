package homework2;

import java.util.Arrays;

public class task6 { //нахождение индексов дубликатов в отсортированном массиве
    public static void main(String[] args) {
        int[] arrayNum = {1, 2, 1, 1, 5, 1};
        int[] sortArray = Arrays.copyOf(arrayNum, arrayNum.length);
        Arrays.sort(sortArray);
        int count = 1;
        int num = 0;
        for (int i = 1; i < sortArray.length; i++) {
            if (sortArray[i - 1] == sortArray[i]) {
                num = sortArray[i];
                count++;
            }
        }
        int[] arrayDouble = new int[count];
        int index = 0;
        for (int i = 0; i < arrayNum.length; i++) {
            if (arrayNum[i] == num) {
                arrayDouble[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(arrayDouble));
    }
}

