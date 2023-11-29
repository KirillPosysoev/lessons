package homework3;

import org.junit.Assert;
import org.junit.Test;

public class TestTask2 {
    @Test
    public void test2() {

        int[] array = new int[] {-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        int[] result = Task2.insertSort(array);
        int[] expected = {10, 8, 5, 5, 2, 1, 1, 0, -2, -9};
        Assert.assertArrayEquals(expected, result);
    }
}
