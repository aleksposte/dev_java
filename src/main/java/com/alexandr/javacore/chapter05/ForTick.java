package com.alexandr.javacore.chapter05;

public class ForTick {
    public static void main(String[] args) {
       // int n; // достна во всем методе

        for(int n = 10; n > 0; n--) // доступна только в for
            System.out.println("такт: " + n);
    }
}
