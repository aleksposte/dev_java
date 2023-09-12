package com.alexandr.javacore.module_1_2_tasks;

public class CheckSumIndex {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 15, 17 };
        int result = 23;
        int index[] = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    if (arr[i] + arr[j] == result) {
                        index[1] = i;
                        index[0] = j;
                    };
                }
            }

        }
        System.out.println("Result = [" + index[0] + ", " + index[1] + "]");
    }
}
