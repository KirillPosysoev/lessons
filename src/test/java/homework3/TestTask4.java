package homework3;

import org.junit.Assert;
import org.junit.Test;

public class TestTask4 {
    @Test
    public void bubbleSortArrayCorrectly() {

        int[] array = new int[]{1, 9, 6, 2, 5, 7, 8};
        int[] result = Task4.bubbleSort(array);
        int[] expected = {1, 2, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void binarySearchReturnCorrectNumIfFounded() {

        int[] array = new int[]{1, 2, 5, 6, 7, 8, 9};
        int num = 5;
        int result = Task4.binarySearch(array, num, 0, array.length - 1);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void binarySearchReturnCorrectNumIfNotFounded() {

        int[] array = new int[]{1, 2, 5, 6, 7, 8, 9};
        int num = 3;
        int result = Task4.binarySearch(array, num, 0, array.length - 1);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }


}
