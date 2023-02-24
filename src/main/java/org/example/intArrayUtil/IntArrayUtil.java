package org.example.intArrayUtil;

public class IntArrayUtil {
    public static int[] swapEven(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length - 1 - i; i++) {

                if (array[i] % 2 == 0 && array[array.length - 1 - i] % 2 == 0) {
                    int temp = array[i];
                    array[i] = array[array.length - 1 - i];
                    array[array.length - 1 - i] = temp;
                }
            }
            return array;
        }
        return null;
    }
}
