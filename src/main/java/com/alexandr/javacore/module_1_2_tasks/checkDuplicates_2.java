package com.alexandr.javacore.module_1_2_tasks;

import java.util.*;

public class checkDuplicates_2 {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 6, 8 };
//        int[] arr = { 4, 5, 6, 7, 8 };
        int duplicate = 1;
        int valDuplicate = 0;

        Map<Integer, Boolean> arrMap = new HashMap<Integer, Boolean> ();

        for (int i = 0; i < arr.length; i++) {
            Boolean preVal = arrMap.putIfAbsent(arr[i], true);
            if (preVal != null) {
                duplicate++;
                valDuplicate = arr[i];
            }
        }

        if(valDuplicate > 1)
            System.out.println("Number " + valDuplicate + " duplicated " + duplicate);
        else System.out.println("no duplicates");
    }
}
