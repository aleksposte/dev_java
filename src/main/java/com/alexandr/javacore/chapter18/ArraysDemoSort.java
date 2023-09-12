package com.alexandr.javacore.chapter18;

import java.util.*;

public class ArraysDemoSort {
    public static void main(String[] args) {
        int array [] = new int[10];
        for (int i = 0; i < 10; i++)
            array [i] = -3 * i;

        System.out.println("array: ");
        display(array);

        Arrays.sort(array);
        System.out.println("array sorted: ");
        display(array);

        // search val -9
        System.out.print("val -9 has index: ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    private static void display(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
