package com.alexandr.javacore.chapter03;

public class Coпversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\n преобразование int -> byte");
        b = (byte) i;
        System.out.println("i и b: " + i + " " + b);

        System.out.println("\n преобразование double  -> int");
        i = (int) d;
        System.out.println("d и i: " + d + " " + i);

        System.out.println("\n преобразование double -> byte");
        b = (byte) d;
        System.out.println("d и b: " + d + " " + b);
    }
}
