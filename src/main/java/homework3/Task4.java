package homework3;


public class Task4 {
    public static void main(String[] args) {
        int[] array = {333, 4444, 0, 444, 5, 0, -222, 6, 4, 5};
        int num = 5;
        bubbleSort(array);
        System.out.println(binarySearch(array, num, 0, array.length - 1));
    }

    static int[] bubbleSort(int[] array) { //сортировка пузырьком
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int buff;
                if (array[j] > array[j + 1]) {
                    buff = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buff;
                }
            }
        }
        return array;
    }

    static int binarySearch(int[] array, int value, int l, int r) {
        if (l == r) {
            if (array[l] == value) {
                return array[l];
            }
            return -1;
        }
        int m = l + (r - l) / 2;
        if (value > array[m]) {
            return binarySearch(array, value, m + 1, r);
        } else if (value < array[m]) {
            return binarySearch(array, value, l, m - 1);
        }
        return array[m];
    }
}
