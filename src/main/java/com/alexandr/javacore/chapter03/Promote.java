package com.alexandr.javacore.chapter03;

public class Promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1-24;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        double result = (f * b) + (i / c) - (d * c);
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * c));
        System.out.println("result = " + result);
    }
}
