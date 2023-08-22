package com.alexandr.javacore.chapter05;

public class Return {
    public static void main(String[] args) {
        boolean t = true;

        System.out.println("до возврата");

        if (t) return;
        System.out.println("этот оператор не будет выполнен");
    }
}
