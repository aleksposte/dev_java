package com.alexandr.javacore.module_1_2_tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckSumIndex_2 {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 15, 17 };
        int sumIndices = 23;

        int[] arrIndices = checkSum(arr, sumIndices);
        System.out.println(Arrays.toString(arrIndices));
    }

    public static int[] checkSum(int[] arr, int sumIndices) {
        Map<Integer, Integer> mapArr = new HashMap<>();
        int[] index = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if (mapArr.containsKey(sumIndices - arr[i])) {
                index[1] = i;
                index[0] = mapArr.get(sumIndices - arr[i]);
                return index;
            }mapArr.put(arr[i], i);
        }
        return index;
    }
}
