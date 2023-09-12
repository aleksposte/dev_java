package com.alexandr.javacore.module_1_2_tasks;

import com.alexandr.javacore.chapter03.Array;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {22, 34, 266, 0, 45, 6, -6};

        BubbleSort bSort = new BubbleSort();
        BubbleSort.display(BubbleSort.bubbleSort(arr));
    }

    public static int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }

    public static void display(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
