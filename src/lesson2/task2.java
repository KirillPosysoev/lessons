package lesson2;

public class task2 {
    public static void main(String[] args) {

        int[] array = {5, 29, 9, 4, 12, 9};

        int minElementIndex = 0;
        int minElement = array[minElementIndex];

        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];

            if (currentElement < minElement) {
                minElement = currentElement;
                minElementIndex = i;
            }
        }

        System.out.println("Min element index " + minElementIndex);
    }
}
