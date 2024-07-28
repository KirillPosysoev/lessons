package homework3;

import org.junit.Assert;
import org.junit.Test;

public class TestTask1 {
    @Test
    public void test1() {

        int[] array = new int[] {-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        int result = Task1.minElementIndex(array);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void test2() {

        int[] array = new int[]{-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        int[] result = Task1.selectSortArray(array);
        int[] expected = {-9, -2, 0, 1, 1, 2, 5, 5, 8, 10};
        Assert.assertArrayEquals(expected, result);
    }
}