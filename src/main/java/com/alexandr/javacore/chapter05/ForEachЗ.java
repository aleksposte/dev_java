package com.alexandr.javacore.chapter05;

// for each для двухмерного массива
public class ForEachЗ {
    public static void main(String[] args) {
        int nums[][] = new int[3][5];
        int sum = 0;

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums[i][j] = (i + 1)* (j + 1);

        for (int x[] : nums) {
            for (int y : x) {
                System.out.println("значение равно: " + y);
                sum += y;
            }
        }
        System.out.println("сумма: " + sum);
    }
}
