package com.alexandr.javacore.module_1_2_tasks;

import java.util.*;

public class checkDuplicates {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 6, 8, 6 };
//        int[] arr = { 4, 5, 6, 7, 8 };
        int duplicate = 1;
        int valDuplicate = 0;

        Set<Integer> setNum = new HashSet<Integer>();

        for (int i : arr) {
            if (setNum.contains(i)) {
                duplicate++;
                valDuplicate = i;
            }
            setNum.add(i);
        }

        if(valDuplicate > 1)
            System.out.println("Number " + valDuplicate + " duplicated " + duplicate);
        else System.out.println("no duplicates");
    }
}
