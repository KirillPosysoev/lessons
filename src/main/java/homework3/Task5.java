package homework3;


public class Task5 {
    public static void main(String[] args) {
        int[] array = {333, 4444, 0, 444, 5, 0, -222, 6, 4, 5};
        int num = 333;
        array = mergeSort(array);
        System.out.println(binarySearch(array, num, 0, array.length - 1));
    }

    static int[] mergeSort(int[] array) { //сортировка слиянием
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }

        int[] arrayA = new int[array.length / 2];
        int[] arrayB = new int[array.length - arrayA.length];

        System.arraycopy(array, 0, arrayA, 0, arrayA.length);
        System.arraycopy(array, arrayA.length, arrayB, 0, arrayB.length);

        arrayA = mergeSort(arrayA);
        arrayB = mergeSort(arrayB);

        return mergeArrays(arrayA, arrayB);
    }

    static int[] mergeArrays(int[] arrayA, int[] arrayB) {
        int[] resultArray = new int[arrayA.length + arrayB.length];
        int posA = 0;
        int posB = 0;

        for (int i = 0; i < resultArray.length; i++) {
            if (posA == arrayA.length) {
                resultArray[i] = arrayB[posB];
                posB++;
            } else if (posB == arrayB.length) {
                resultArray[i] = arrayA[posA];
                posA++;
            } else if (arrayA[posA] < arrayB[posB]) {
                resultArray[i] = arrayA[posA];
                posA++;

            } else {
                resultArray[i] = arrayB[posB];
                posB++;
            }
        }
        return resultArray;
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
