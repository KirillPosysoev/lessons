package homework3;

import org.junit.Assert;
import org.junit.Test;

public class TestTask3 {
    @Test
    public void test1() {

        int[] array = new int[]{-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        int num = 2;
        int result = Task3.linearSearch(array, num);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void test2() {

        int[] array = new int[] {-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        int num = 7;
        int result = Task3.linearSearch(array, num);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}
