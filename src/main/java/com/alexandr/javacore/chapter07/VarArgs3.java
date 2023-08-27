package com.alexandr.javacore.chapter07;

public class VarArgs3 {
    static void vaTest(int ... v) {
        System.out.println("vaTest(int ... v " + "количество аргументов: " + v.length + " содержимое");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.println("vaTest(boolean ... v " + "количество аргументов: " + v.length + " содержимое");

        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String msg, int ... v) {
        System.out.println("vaTest(String msg, int ... v) " + "количество аргументов: " + v.length + " содержимое");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("проверка: ", 10, 20 );
        vaTest(true, false, false);
    }
}
