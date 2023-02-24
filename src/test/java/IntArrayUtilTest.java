import org.example.IntArrayUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class IntArrayUtilTest {
    @Test
    void evenElementsAreSwapped() {
        {
            int[] expected = null;
            int[] actual = null;
            IntArrayUtil.swapEven(actual);
            assertArrayEquals(expected, actual);
        }
        {
            int[] expected = new int[]{};
            int[] actual = new int[]{};
            IntArrayUtil.swapEven(actual);
            assertArrayEquals(expected, actual);
        }
        {
            int[] expected = new int[]{1};
            int[] actual = new int[]{1};
            IntArrayUtil.swapEven(actual);
            assertArrayEquals(expected, actual);
        }
        {
            int[] expected = new int[]{1, 2};
            int[] actual = new int[]{1, 2};
            IntArrayUtil.swapEven(actual);
            assertArrayEquals(expected, actual);
        }
        {
            int[] expected = new int[]{1, 2, 3};
            int[] actual = new int[]{1, 2, 3};
            IntArrayUtil.swapEven(actual);
            assertArrayEquals(expected, actual);
        }
        {
            int[] expected = new int[]{0, 2, 3};
            int[] actual = new int[]{0, 2, 3};
            IntArrayUtil.swapEven(actual);
            assertArrayEquals(expected, actual);
        }
        {
            int[] expected = new int[]{1, 2, 0};
            int[] actual = new int[]{1, 2, 0};
            IntArrayUtil.swapEven(actual);
            assertArrayEquals(expected, actual);
        }
        {
            int[] expected = new int[]{4, 2, 0};
            int[] actual = new int[]{0, 2, 4};
            IntArrayUtil.swapEven(actual);
            assertArrayEquals(expected, actual);
        }
        {
            int[] expected = new int[]{4, 2, 3, 0};
            int[] actual = new int[]{0, 2, 3, 4};
            IntArrayUtil.swapEven(actual);
            assertArrayEquals(expected, actual);
        }
        {
            int[] expected = new int[]{4, 5, 0, 3, 10};
            int[] actual = new int[]{10, 5, 0, 3, 4};
            IntArrayUtil.swapEven(actual);
            assertArrayEquals(expected, actual);
        }
        {
            int[] expected = new int[]{100, 4, 3, 2, 5};
            int[] actual = new int[]{100, 2, 3, 4, 5};
            IntArrayUtil.swapEven(actual);
            assertArrayEquals(expected, actual);
        }
        {
            int[] expected = new int[]{54, 4, 3, 45, 33, 8, 2, 100};
            int[] actual = new int[]{100, 2, 3, 45, 33, 8, 4, 54};
            IntArrayUtil.swapEven(actual);
            assertArrayEquals(expected, actual);
        }
    }
}

