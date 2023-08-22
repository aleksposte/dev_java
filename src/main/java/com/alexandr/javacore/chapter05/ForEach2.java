package com.alexandr.javacore.chapter05;

// break в цикле for в стиле for each
public class ForEach2 {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        for (int x : nums) {
            System.out.println("значение равно: " + x);
            sum += x;

            if (x == 5) break;
        }
        System.out.println("сумма 5 первых элементов равна: " + sum);
    }
}
