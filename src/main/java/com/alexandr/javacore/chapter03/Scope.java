package com.alexandr.javacore.chapter03;

public class Scope {
    public static void main(String[] args) {
        int x; // доступен всему коду из main
        x = 10;

        if (x == 10) { // начало новой оюласти действия
            int y = 20; // y - доступен только внутри этого блока кода

            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        // y =100; // в этой области действия - y недоступен, x - доступен
        System.out.println("x равен: " + x);
    }
}
