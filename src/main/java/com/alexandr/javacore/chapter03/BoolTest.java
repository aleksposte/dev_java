package com.alexandr.javacore.chapter03;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно: " + b);

        b = true;
        System.out.println("b равно: " + b);

        // Значение boolean может управляться if
        if (b)
            System.out.println("этот код выполняется");
        b = false;
        if (b)
            System.out.println("этот код не выполняется");

        // результат сравнения - значение типа boolean
        System.out.println("10 > 9 равно: " + (10 > 9));
    }
}
