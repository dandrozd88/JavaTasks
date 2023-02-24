package org.example;

import java.util.Arrays;

import static org.example.IntArrayUtil.swapEven;

public class Main {
    public static void main(String[] args) {
        {
            int[] array = null;
            swapEven(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[]{};
            swapEven(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[]{10, 5, 3, 4};
            swapEven(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[]{100, 2, 3, 4, 5};
            swapEven(array);
            System.out.println(Arrays.toString(array));
        }
        {
            int[] array = new int[]{100, 2, 3, 45, 33, 8, 4, 54};
            swapEven(array);
            System.out.println(Arrays.toString(array));
        }
    }
}
