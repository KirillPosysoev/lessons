package homework2;

import java.util.Arrays;

public class task5 { //нахождение индексов дубликатов в отсортированном массиве
    public static void main(String[] args) {
        int[] arrayNum = {0, 0, 1, 5};
        int count = 0;
        int lastIndex = 0;
        for (int i = 1; i < arrayNum.length; i++) {
            if (arrayNum[i - 1] == arrayNum[i]) {
                lastIndex = i;
                count++;
            }
        }
        if (count > 0) {
            int[] arrayDouble = new int[count + 1];
            for (int i = count; i >= 0; i--) {
                arrayDouble[i] = lastIndex;
                lastIndex--;
            }
            System.out.println(Arrays.toString(arrayDouble));
        } else {
            int[] arrayDouble = new int[count];
            System.out.println(Arrays.toString(arrayDouble));
        }
    }
}

